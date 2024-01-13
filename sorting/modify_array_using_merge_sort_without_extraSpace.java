package sorting;
import java.util.*;
//Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
// Merge them in sorted order without using any extra space.
// Modify arr1 so that it contains the first N elements and modify arr2
// so that it contains the last M elements.

//Input:
//n = 4, arr1[] = [1 3 5 7]
//m = 5, arr2[] = [0 2 6 8 9]
//Output:
//arr1[] = [0 1 2 3]
//arr2[] = [5 6 7 8 9]
//Explanation:
//After merging the two
//non-decreasing arrays, we get,
//0 1 2 3 5 6 7 8 9.
public class modify_array_using_merge_sort_without_extraSpace {

    public static void merge(int arr1[], int arr2[], int n, int m)
    {
        // code here
        int[] arr3 = new int[m+n];

        int i=0,j=0,k=0;

        while(i<arr1.length)
        {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length)
        {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        Arrays.sort(arr3);

        i=0;j=0;k=0;
        while(i<arr1.length)
        {
            arr1[i] = arr3[k];
            i++;
            k++;
        }

        while(j<arr2.length)
        {
            arr2[j] = arr3[k];
            k++;
            j++;

        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,3 ,5 ,7};
        int arr2[] = {0,2,6,8,9};
        int n=4;
        int m=5;
        merge(arr1,arr2,n,m);

        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for (int i=0; i<m ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
