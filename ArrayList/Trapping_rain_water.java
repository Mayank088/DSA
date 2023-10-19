package ArrayList;

public class Trapping_rain_water
{
    int getWater(int arr[])
    {                          //time = O(n^2)    , space = O(1)
        int n = arr.length;
        int res = 0;

        for (int i=1 ; i<n-1; i++)
        {
            int leftMax = arr[i];
            for (int j=0 ; j<i ;j++)
            {
                leftMax = Math.max(leftMax , arr[j]);
            }

            int rightMax = arr[i];
            for (int j=i+1 ; j<n ; j++)
            {
                rightMax = Math.max(rightMax , arr[j]);
            }

            res = res + (Math.min(leftMax , rightMax) - arr[i]);
        }
        return res;
    }


    public static int getWater2(int arr[])
    {                                               //time = O(n)    , space = O(n)
        int n = arr.length;

        int res = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        for (int i=1 ; i<n ; i++)
        {
            leftMax[i] = Math.max(arr[i] , leftMax[i-1]);
        }

        rightMax[n-1] = arr[n-1];
        for (int i=n-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(arr[i] , rightMax[i+1]);
        }

        for (int i=1 ; i<n-1 ; i++)
        {
            res = res + (Math.min(leftMax[i] , rightMax[i]) - arr[i]);
        }

        return res;

    }


    public static void main(String[] args)
    {
        int arr[] = {3,0,1,2,5};
        Trapping_rain_water t = new Trapping_rain_water();
        int ans = t.getWater(arr);
        System.out.println(ans);

        int ans2 = getWater2(arr);
        System.out.println(ans2);
    }
}
