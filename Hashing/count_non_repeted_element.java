package Hashing;
import java.util.HashMap;
//You are given an array of integers. You need to print the count of non-repeated elements in the array.
//Input:
//  10
//  1 1 2 2 3 3 4 5 6 7

//Output:
//4

//Explanation:
//4, 5, 6 and 7 are the
//elements with frequency 1 and rest elements are repeated so the number of non-repeated elements are 4.

//Input:
//5
//10 20 30 40 10

//Output:
//3

//Explanation:
//20, 30, 40 are the
//elements with the frequency 1 and 10 is the repeated element to number of non-repeated elements are 3.
public class count_non_repeted_element
{

    public static int count(int arr[])       //time O(n)  , space (n)
    {
        HashMap<Integer , Integer> h = new HashMap<>();

        for (int i=0 ; i<arr.length ; i++)
        {
            if (h.containsKey(arr[i]))
            {
                h.put(arr[i] , h.get(arr[i])+1);         //get() => aa () breket ni andar je key aapsi eni value aapse
            }
            else
            {
                h.put(arr[i] , 1);
            }
        }
        int count = 0;
        for (int i=0 ; i<arr.length ; i++)
        {
            if (h.get(arr[i])==1)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int arr[] = {1 ,1 ,2, 2, 3, 3 ,4 ,5 ,6, 7 };
        int ans = count(arr);
        System.out.println(ans);
    }
}
