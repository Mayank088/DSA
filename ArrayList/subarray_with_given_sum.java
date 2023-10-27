package ArrayList;

public class subarray_with_given_sum
{
    public static boolean sum(int arr[] , int sum)    //time : O(n^2) , space = O(1)
    {
        int n = arr.length;

        for (int i=0 ; i<n ; i++)
        {
            int curr_sum = 0;
            for (int j = i ; j<n ; j++)
            {
                curr_sum = curr_sum + arr[j];
                if (curr_sum == sum)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSum(int arr[] , int sum)  //time : O(n) , space = O(1)
    {
        int n = arr.length;
        int start = 0;
        int curr_sum = 0;
        for (int e = 0 ; e<n ; e++)
        {
            curr_sum = curr_sum + arr[e];
            while (sum < curr_sum)      //curr_sum moto no thay tiya sudhi loop halave
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,4,20,3,10,5};
        int sum = 33;

        System.out.println(sum(arr,sum));
    }
}
