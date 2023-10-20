package ArrayList;

public class Maximum_sum_of_subarray
{
    public static int sum(int arr[])     //time : O(n^2)   , space = O(1)
    {
        int n = arr.length;
        int res = arr[0];
        for (int i=0 ; i<n ; i++)
        {
            int curr = 0;
            for (int j=i ; j<n ; j++)
            {
                curr = curr+arr[j];
                res = Math.max(res , curr);
            }
        }
        return res;
    }


    public static int sum2(int arr[])          //time : O(n)  , space = O(1)
    {
        int n=arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i=0 ; i<n ; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            res = Math.max(res , maxEnding);
        }
        return res;
    }


    public static void main(String[] args)
    {
        int arr[] = {1,-2,3,-1,2};
        int ans = sum(arr);
        System.out.println(ans);

        int arr2[] = {-3 , 8 , -2 , 4 , -5 , 6};
        int ans2 = sum2(arr2);
        System.out.println(ans2);

    }
}
