package Searching;
import java.util.*;
public class square_root {

    public static int squareRoot(int x)
    {
        double ans = Math.sqrt(x);
        return (int) ans;
    }

    public static int squareRoot2(int x)
    {
        int i=1;
        while (i*i<=x)            //time = theta(√X)
        {
            i++;
        }
        return (i-1);
    }

    public static int squareRoot3(int x)     //time O(logn)
    {
        int start = 1;
        int end = x;
        int ans = -1;

        while (start<=end)
        {
            int mid = (start+end)/2;

            if ((mid*mid) == x)
            {
                return mid;
            }

            else if ((mid*mid) > x)
            {
                end = mid-1;
            }
            else  {
                start = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int x = 24;
        int ans = squareRoot3(x);
        System.out.println(ans);
    }
}
