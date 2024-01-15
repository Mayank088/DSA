package sorting;

import java.util.Arrays;

public class union_of_two_sorted_array {
    public static void union(int arr1[], int arr2[])       //time: O(n+m) , space : O(1)
    {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (i > 0 && arr1[i] == arr1[i - 1])
            {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1])
            {
                j++;
                continue;
            }

            if (arr1[i]==arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j])
            {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else
            {
                System.out.print(arr2[j] + " ");
                j++;
            }

        }

        while (i < arr1.length)
        {
            if (i > 0 && arr1[i] == arr1[i - 1])
            {
                i++;
                continue;
            }

            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < arr2.length)
        {
            if (j > 0 && arr2[j] == arr2[j - 1])
            {
                j++;
                continue;
            }
            
            System.out.print(arr2[j] + " ");
            j++;
        }
    }


    public static void union2(int arr1[], int arr2[])       //time  : O((n+m)*(log(n+m)) , space : O(n+m)
    {
        int n = arr1.length;
        int m = arr2.length;
        int c[] = new int[n+m];

        for (int i=0; i<n ; i++)
        {
            c[i] = arr1[i];
        }

        for (int i=0 ; i<m ; i++)
        {
            c[i+n] = arr2[i];
        }

        Arrays.sort(c);

        for (int i=0 ; i<n+m ; i++)
        {
            if (i==0 || c[i]!=c[i-1])
            {
                System.out.print(c[i] + " ");
            }
        }
    }


    public static void main(String args[])
    {
        int arr1[] = {3,5,8};
        int arr2[] = {2,8,9,10,15};

        union(arr1,arr2);
    }
}
