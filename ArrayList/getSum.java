package ArrayList;

public class getSum
{
    int sum(int arr[] , int s , int e)       //time : theta( e-s + 1)   or  O(n)   , space : O(1    )
    {
       // int n = arr.length;
        int res = 0;
        for (int i=s ; i<=e ; i++)
        {
            res = res + arr[i];
        }
        return res;
    }

//    time O(1) because we assume that prefix sum is diff function asd getsum is diff.
//    so we find first prefix sum that require theta(n) time and theta(n) space
//    next we find getsum in O(1) time
    public static int prefixSum(int arr[] , int s , int e)
    {
        int n = arr.length;
        int preSum[] = new int[n];

        preSum[0] = arr[0];

        for (int i=1 ; i<n ; i++)
        {
            preSum[i] = preSum[i-1] + arr[i];
        }

        if (s == 0)
        {
            return preSum[e];
        }
        else
        {
            return preSum[e] - preSum[s-1];
        }
    }



    //  i/p : {2,3,5,4,6,1}
    //get_W_sum(0,2) => o/p = 23
    //  (1 * 2) + (2 * 3) + (3 * 5) = (2+6+15) = 23

    //get_W_sum(2,3) => o/p = 13
    //  (1 * 5) + (2 * 4) = (5+8) = 13
    //aagd 1 , 2, 3, 4 ,5 ... n em gunva
    public static int prefix_Weighted_Sum(int arr[] , int s , int e)
    {
        int n = arr.length;
        int pre_W_Sum[] = new int[n];

        pre_W_Sum[0] = arr[0];

        for (int i=1 ; i<n ; i++)
        {
            pre_W_Sum[i] =  i * arr[i] + pre_W_Sum[i-1];
        }

        if (s == 0)
        {
            return pre_W_Sum[e];
        }
        else
        {
            return pre_W_Sum[e] - pre_W_Sum[s-1];
        }
    }



    public static void main(String[] args)
    {
            int arr[] = {2,8,3,9,6,5,4};
            int start = 1;
            int end = 3;

            getSum g = new getSum();
            int ans = g.sum(arr,start,end);
            System.out.println(ans);


           int ans2 =prefixSum(arr,start,end);
           System.out.println(ans2);


           

    }
}
