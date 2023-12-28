package Searching;
import java.util.*;
public class Subarray_with_given_sum {

    public static ArrayList<Integer> subarraySum(int[] arr, int s)     //time O(n) , space (1)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;

        int sum = 0;

        int n = arr.length;
        for(int j=0 ; j<n ; j++)
        {
            sum = sum + arr[j];

            while(sum > s)
            {
                sum = sum - arr[i];
                i++;
            }

            if(sum == s && i<=j)
            {
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int s = 12;

         ArrayList<Integer> ans = subarraySum(arr, s);
        System.out.println(ans);
    }
}
