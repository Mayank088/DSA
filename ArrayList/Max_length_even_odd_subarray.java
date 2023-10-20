package ArrayList;

public class Max_length_even_odd_subarray
{
    static int maxEvenOdd(int arr[])         //time : O(n^2)  , space : O(1)
    {
        int res = 1;
        int n=arr.length;
        for(int i = 0; i < n; i++)
        {
            int curr = 1;

            for(int j = i + 1; j < n; j++)
            {
                if((arr[j] % 2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0))
                {
                    curr++;
                }
                else
                {
                    break;
                }
            }

            res = Math.max(res, curr);
        }

        return res;
    }


    public static int maxEvenOdd2(int arr[])       //time : O(n)  , space : O(1)
    {
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i=1 ; i<n ; i++)
        {
            if((arr[i] % 2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
            {
                curr++;
                res = Math.max(res , curr);
            }
            else
            {
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {5,10,20,6,3,8};
        int ans = maxEvenOdd2(arr);
        System.out.println(ans);
    }
}
