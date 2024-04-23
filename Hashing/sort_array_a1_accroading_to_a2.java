package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

//Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. Sort the first array A1[ ] such that all the relative positions of the elements in the first array are the same as the elements in the second array A2[ ].
//See example for better understanding.
//Note: If elements are repeated in the second array, consider their first occurance only.
//
//Example 1:
//
//Input:
//N = 11
//M = 4
//A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//A2[] = {2, 1, 8, 3}
//Output:
//2 2 1 1 8 8 3 5 6 7 9
//Explanation: Array elements of A1[] are
//sorted according to A2[]. So 2 comes first
//then 1 comes, then comes 8, then finally 3
//comes, now we append remaining elements in
//sorted order.
//Example 2:
//
//Input:
//N = 11
//M = 4
//A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//A2[] = {99, 22, 444, 56}
//Output:
//1 1 2 2 3 5 6 7 8 8 9
//Explanation: No A1[] elements are in A2[]
//so we cannot sort A1[] according to A2[].
//Hence we sort the elements in non-decreasing
//order.
public class sort_array_a1_accroading_to_a2
{

    //not running
    public static int[] sortA1A2(int a1[] , int a2[])
    {
        int n = a1.length;
        int m = a2.length;

        HashMap<Integer , Integer> h = new HashMap<>();
        for (int i=0 ; i<n ; i++)
        {
            if (!h.containsKey(a1[i]))
            {
                h.put(a1[i] , 1);
            }
            else
            {
                h.put(a1[i] , h.get(a1[i])+1);
            }
        }


        int index=0;
        for (int i=0 ; i<m ; i++)
        {
            if (h.containsKey(a2[i]))
            {
                for (int j=0 ; j<h.get(a2[i]) ; j++)
                {
                    a1[index] = a2[i];
                    index++;
                    h.remove(a2[i]);
                }
            }
        }

        //whose freq. those have only one time occure in array (reamiang element.)
        for (Map.Entry<Integer , Integer> k : h.entrySet())
        {
            for (int p=0 ; p<k.getValue() ; p++)
            {
                a1[index] = k.getKey();
            }
        }

        return a1;
    }


    //running

    public static int[] sortA1ByA2(int A1[],int A2[])     //time O(n * logn)  space O(n)
    {
        int N = A1.length;
        int M = A2.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        //storing all the elements of first array in map.
        for(int i=0; i<N; i++)
        {
            if(!map.containsKey(A1[i]))
            {
                map.put(A1[i], 1);
            }
            else
            {
                map.put(A1[i],map.get(A1[i])+1);
            }
        }

        int index =0;

        for(int i=0;i<M;i++)
        {
            //if any element of second array has value more than 0 in map, we
            //store those elements in array and decrement the count in map.
            if(map.containsKey(A2[i]))
            {
                for( int k=0;k<map.get(A2[i]);k++)
                {
                    A1[index]=(A2[i]);
                    index++;
                    map.remove(A2[i]);
                }

            }
        }

        //iterating over the map which helps in storing
        //elements in increasing order.
        for(Map.Entry<Integer,Integer> nag : map.entrySet())
        {
            //storing elements whose frequency is more than 0, as many times as
            //their count in output list.
            for(int p=0;p<nag.getValue();p++)
            {
                A1[index]=nag.getKey();
                index++;
            }

        }
        return A1;
    }

    public static void main(String[] args)
    {
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};

        int ans[] = sortA1ByA2(A1,A2);

        for (int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
