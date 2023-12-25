package Searching;
import java.util.*;
// Given an array arr of size N and an element k.
// The task is to find the count of elements in the array that appear more than n/k times.

//      i/p
//        N = 8
//        arr = [3,1,2,2,1,2,3,3]
//        k = 4
//        Output:
//        2
//        Explanation:
//        In the given array, 3 and 2 are the only elements that appears more than n/k times.
public class more_than_n_BY_k {

    public int countOccurence(int[] arr, int n, int k)
    {

        int temp[] = new int[100001];           //time O(n) , space = O(1) beacuse here fix size array
        Arrays.fill(temp , 0);

        int ans = 0;

        for(int i=0 ; i<n ; i++)
        {
            temp[arr[i]]++;

        }

        for(int i=0 ; i<100001 ; i++)
        {
            if(temp[i] > (n/k))
            {
                ans++;
            }
        }

        return ans;

    }

    public static int countOccur(int arr[] , int n , int k)
    {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            max = Math.max(max, arr[i]);
        }

        int[] temp = new int[max + 1];
        Arrays.fill(temp, 0);

        int ans = 0;

        for(int i=0 ; i<n ; i++)
        {
            temp[arr[i]]++;
        }

        for(int i=0 ; i<max+1 ; i++)
        {
            if(temp[i] > (n/k))
            {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[] = {3,1,2,2,1,2,3,3};
        int n = 8;
        int k = 4;

        int ans = countOccur(arr,n,k);
        System.out.println(ans);
    }

}
