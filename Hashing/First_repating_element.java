package Hashing;
//Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
//
//Note:- The position you return should be according to 1-based indexing.
//
//Example 1:
//
//Input:
//n = 7
//arr[] = {1, 5, 3, 4, 3, 5, 6}
//Output: 2
//Explanation:
//5 is appearing twice and
//its first appearence is at index 2
//which is less than 3 whose first
//occuring index is 3.
//
//Example 2:
//
//Input:
//n = 4
//arr[] = {1, 2, 3, 4}
//Output: -1
//Explanation:
//All elements appear only once so
//answer is -1.

import java.util.HashMap;

public class First_repating_element {

    public static int first_repeat_index(int arr[])
    {
        int n = arr.length;

        HashMap<Integer , Integer> h = new HashMap<>();
        for (int i=0 ; i<n ; i++)
        {
            if (h.containsKey(arr[i]))
            {
                h.put(arr[i] , h.get(arr[i])+1);
            }
            else {
                h.put(arr[i] , 1);
            }
        }

        for (int i=0 ; i<n ; i++)
        {
            if (h.get(arr[i]) > 1)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        int ans = first_repeat_index(arr);
        System.out.println(ans);
    }
}
