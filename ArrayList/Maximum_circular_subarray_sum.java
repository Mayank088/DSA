package ArrayList;

public class Maximum_circular_subarray_sum
{
    public static int maxCircularSum(int arr[])
    {                               //time : O(n^2)  , space = O(1)
        int n = arr.length;
        int res = arr[0];
        for (int i=0 ; i<n ; i++)
        {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1 ; j<n ; j++)
            {
                int index = (i+j) % n;
                curr_sum = curr_sum + arr[index];
                curr_max = Math.max(curr_max , curr_sum);
            }
            res = Math.max(res , curr_max);
        }
        return res;
    }


//or


    //time = O(n) , space = O(1)
    public static int normalMaxSum(int arr[])
    {
            int n = arr.length;
            int res = arr[0];

            int maxEnding = arr[0];

            for (int i = 1; i < n; i++) {
                maxEnding = Math.max(maxEnding + arr[i], arr[i]);

                res = Math.max(maxEnding, res);
            }

            return res;
    }
    static int overallMaxSum(int arr[])
    {
        int max_normal = normalMaxSum(arr);
        int n = arr.length;
        if(max_normal < 0)
        {
            return max_normal;
        }

        int original_arr_sum = 0;

        for(int i = 0; i < n; i++)
        {
            original_arr_sum = original_arr_sum +  arr[i];

            arr[i] = -arr[i];   //it convert original array element into invert of original.
        }

        int max_circular = original_arr_sum + normalMaxSum(arr);  //this is not original arr. it is inverted arr

        return Math.max(max_circular, max_normal);
    }


    public static void main(String[] args)
    {
        int arr[] = {5,-2,3,4};
        int ans = maxCircularSum(arr);
        System.out.println(ans);

        int ans2 = overallMaxSum(arr);
        System.out.println(ans2);
    }
}
