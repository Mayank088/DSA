package sorting;

import java.util.Arrays;

public class minimum_diff_in_array
{
    public static int diff1(int arr[])
    {
        int res = Integer.MAX_VALUE;
        for (int i=1 ; i<arr.length-1 ; i++)
        {
            for (int j=0 ; j<i ; j++)
            {
                res = Math.min(res , Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }

    public static int diff2(int arr[])
    {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = arr.length-1 ; i>0 ; i--)
        {
            res = Math.min(res , arr[i]-arr[i-1]);
        }
        return res;
    }

    public static int diff3(int arr[])
    {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1 ; i<arr.length ; i++)
        {
            res = Math.min(res , arr[i]-arr[i-1]);
        }
        return res;
    }


    public static void main(String[] args)
    {
        int arr[] = {1,8,12,5,18};
        int ans1 = diff1(arr);
        int ans2 = diff2(arr);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
