package Hashing;
//You are given an array of distinct integers and a sum.
//Check if there's a pair with the given sum in the array.
//N = 10
//arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//sum = 14
//Output : 1

// Explanation:
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
// and sum = 14.  There is a pair {4, 10}
// with sum 14

import java.util.*;
public class two_sum_using_hashset {


    public static boolean sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks

        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0 ; i<N ; i++)
        {
            h.add(arr[i]);
        }


        for (int i=0 ; i<N ; i++)
        {
            int temp = sum - arr[i];
            if (h.contains(temp))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7, 8,9,10};
        int sum = 19;
        int n = arr.length;
        boolean ans =sumExists(arr,n,sum);
        System.out.println(ans);
    }

}
