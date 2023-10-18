package ArrayList;

public class Stock_buy_sell
{
    public static int maxprofit1(int arr[] , int start , int end)
    {                                               //time = O(n^2)  , space = O(1)
        if (end <= start)
        {
            return 0;
        }

        int profit = 0;

        for (int i=start ; i<end ; i++)
        {
            for (int j = i+1 ; j <=end ; j++)
            {
                if (arr[j] > arr[i])
                {
                    int curr_profit = arr[j] - arr[i] +
                            maxprofit1(arr , start , i-1) +
                            maxprofit1(arr , j+1 , end);

                    profit = Math.max(profit , curr_profit);
                }
            }
        }
        return profit;
    }


    public static int maxprofit2(int arr[])     //time = O(n)  , space = O(1)
    {
        int n = arr.length;
        int profit = 0;

        for (int i=1 ; i<n ; i++)
        {
            if (arr[i] > arr[i-1])
            {
                profit = profit + (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }


    public static void main(String[] args)
    {
        int arr[] = {1,5,3,8,12};
        int start = 0;
        int end = arr.length;
        int ans = maxprofit1(arr,start , end-1);
        System.out.println(ans);

        int ans1 = maxprofit2(arr);
        System.out.println(ans1);
    }
}
