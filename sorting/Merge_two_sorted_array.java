package sorting;

import java.util.Arrays;

public class Merge_two_sorted_array {

    public static void merge_two_array(int arr1[] , int arr2[])           //time : ( O(n+m)*log(m+n) )
    {                                                                     //aux space : theta(n+m)
        int n = arr1.length;
        int m = arr2.length;

        int c[] = new int[n+m];
        for (int i=0 ; i<n ; i++)
        {
            c[i] = arr1[i];
        }

        for (int j=0 ; j<m ; j++)
        {
            c[j+n] = arr2[j];
        }

        Arrays.sort(c);

        for (int i=0; i<n+m ; i++)
        {
            System.out.print(c[i] + " ");
        }
    }


    public static void merge_two_array2(int arr1[], int arr2[])   //time : O(n+m)   , aux space : O(1)
    {
        int n = arr1.length;
        int m = arr2.length;

        int i=0;
        int j=0;

        while (i<n && j<m)
        {
            if (arr1[i] >= arr2[j])
            {
                System.out.print(arr2[j] + " ");
                j++;
            }
            else
            {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

        while (i<n)
        {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j<m)
        {
            System.out.print(arr2[j] + " ");
            j++;
        }

    }






    public static void main(String[] args) {
        int arr1[] = {10,15,20};
        int arr2[] = {5,6,6,15};

        merge_two_array2(arr1,arr2);
    }
}
