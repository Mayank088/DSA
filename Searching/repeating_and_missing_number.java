package Searching;
import java.util.*;

public class repeating_and_missing_number {

    void repeat_miss(int arr[])        //time = O(n)  , space = O(n)
    {
        int missing = 0;
        int repeat = 0;
        int n = arr.length;

        int count[] = new int[n+1];
        Arrays.fill(count, 0);

        for (int i=0 ; i<n ; i++)
        {
            count[arr[i]]++;
        }

        for (int i=0 ; i<n ; i++)
        {
            if (count[i] == 0)
            {
                missing = i;
            }
            if (count[i] == 2)
            {
                repeat = i;
            }
        }
        System.out.println("missing is : " + missing  + " and repeting is : " + repeat);
    }


    public static int rep_miss(int arr[])        //time = O(n) , space = O(1)
    {
        int n = arr.length;
        // s - sn = x - y                 whare x = repeating and  y = missing
        //s2 - s2n = x2 - y2

        int sn = ( n * (n+1) )/2;
        int s2n = ( n * (n+1) * (2*n+1) ) / 6;

        int s = 0;
        int s2 = 0;

        for (int i=0 ; i<n ; i++)
        {
            s += arr[i];
            s2 += arr[i] * arr[i];
        }

        int val1 = s - sn;          //val1 = x - y     ==> x-y = s-sn
        int val2 = s2 - s2n;        //val2 = x2 - y2     ==> x2-y2 = s2-s2n

        //val2 = x2 - y2
        //val2 = (x-y) * (x+y)
        //val2 = val1 * (x+y)
        // val2/val1 = (x+y)

        val2 = val2 / val1;

        // x = (x-y) + (x+y)  ======> val2 + val1
        // x-y  = val1
        // x+y  = val2
        //-------------
        //(x-y) + (x+y) = val1+ val2
        // 2x = val1 + val2
        // x = (val1 + val2 ) / 2

        int x = (val1 + val2) / 2;           //x = repeat
        int y = (x - val1);                  //y = missing

        return x;
    }



    public static void main(String[] args)
    {
        int arr[] = {2,3,2,1,5};
        repeating_and_missing_number obj = new repeating_and_missing_number();  //fun calling without static method
        obj.repeat_miss(arr);


        rep_miss(arr);
    }
}
