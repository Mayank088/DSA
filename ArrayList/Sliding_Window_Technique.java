package ArrayList;

public class Sliding_Window_Technique
{
    public static int maxSum(int arr[] , int k)          //time : O(n^2) , space : O(1)
    {
        int n = arr.length;

        int res=0;
        for (int i=0 ; i<n-k ;i++)
        {
            int sum = 0;
            for (int j=i+1 ; j<=i+k ; j++)
            {
                sum = sum + arr[j];
            }
            res = Math.max(res , sum);
        }
        return res;
    }


   public static int maxSum2(int arr[] , int k)    //time : O(n) , space : O(1)
    {
        int n =arr.length;
        int sum = 0;
        for (int i=0 ; i<k ;i++)
        {
            sum = sum + arr[i];
        }
        int res = sum;
        for (int i=k ; i<n ; i++)
        {
            sum = sum + arr[i] - arr[i-k];
            res = Math.max(sum , res);
        }
        return res;

    }


    public static void main(String[] args)
    {
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;

       int ans= maxSum(arr,k);
        System.out.println(ans);


        int arr2[] = {1,8,30,-5,20,7};
        int k2 = 4;

        int ans2 = maxSum2(arr2 , k2);
        System.out.println(ans2);

    }
}
