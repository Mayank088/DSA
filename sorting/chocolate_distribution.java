package sorting;

import java.util.Arrays;

public class chocolate_distribution {

    public static int distribution(int arr[] , int m)            //time : O(n * logn)
    {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;

        for (int i=0 ; i<arr.length-m ;i++)
        {
            res =  Math.min(res , arr[i+m-1]-arr[i]);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {7,3,2,4,9,12,56};       //2,3,4,7,8,12,56
        int m = 3;
        int ans = distribution(arr,m);
        System.out.println(ans);


        int arr2[] = {3,4,1,9,56,7,9,12};   //1,3,4,7,9,9,12,56
        int m2 = 5;
        int ans2 = distribution(arr2,m2);
        System.out.println(ans2);

    }
}
