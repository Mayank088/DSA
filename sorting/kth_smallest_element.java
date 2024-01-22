package sorting;
//Given an array arr[] of N positive integers and a number K.
// The task is to find the kth smallest element in the array.

//Input:
//N = 5, K = 3
//arr[] = {3,5,4,2,9}
//
//Output:
//4
//
//Explanation:
//Third smallest element in the array is 4.

import java.util.Arrays;

//Input:
//N = 5, k = 5
//arr[] = {4,3,7,6,5}
//
//Output:
//7
//
//Explanation:
//Fifth smallest element in the array is 7.
public class kth_smallest_element
{
    public static int kth_element(int arr[] , int k)   //time : O(n * logn)
    {
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length ; i++)
        {
            if (i+1==k)
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static int kth_element2(int arr[] , int k)  //time : O(n * logn)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }




    //optimal sol. but time complexity is same for naive and this approach.
    public static int kth_element_using_lomuto(int arr[] , int low , int high , int k)  //high = last index no.
    {
        int i=low-1;
        int pivot = arr[high];
        for (int j=0 ; j<=high-1 ; j++)
        {
            if (arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static int kth_element3(int arr[] , int k)
    {
        int low = 0;
        int high = arr.length-1;
        while (low<=high)
        {
            int p = kth_element_using_lomuto(arr,low,high,k);
            if (p == k-1)
            {
                return arr[p];
            }
            else if (p > k-1)
            {
                high = p-1;
            }
            else
            {
                low = p+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,2,4,70,6};
        int k = 3;
        int ans = kth_element2(arr,k);
        System.out.println(ans);

        int ans2 = kth_element3(arr,k);
        System.out.println(ans2);
    }
}
