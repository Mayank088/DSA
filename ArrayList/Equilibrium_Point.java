package ArrayList;

import java.sql.Struct;

public class Equilibrium_Point
{
    boolean isEquilbrium(int arr[])     //time : O(n^2) , space : O(1)
    {
        int n = arr.length;

        for (int i = 0 ; i<n ; i++)
        {
            int left_sum = 0;
            int right_sum = 0;
            for (int j = 0 ; j<i ; j++)
            {
                left_sum = left_sum + arr[j];
            }
            for (int k = i+1 ; k<n ; k++)
            {
                right_sum = right_sum + arr[k];
            }

            if (right_sum == left_sum){
                return true;
            }
        }
        return false;
    }


    boolean isEquilbrium2(int arr[]) //time : O(n) , space : O(1)
    {
        int n = arr.length;
        int right_sum = 0;
        for (int i=0 ; i<n ;i++)
        {
            right_sum = right_sum + arr[i];
        }

        int left_sum = 0;
        for (int i=0 ;i<n ; i++)
        {
            right_sum = right_sum - arr[i];
            if (left_sum == right_sum)
            {
                return true;
            }
            left_sum = left_sum + arr[i];
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {4,2,-2};    //true
        Equilibrium_Point e = new Equilibrium_Point();
        boolean ans = e.isEquilbrium(arr);
        System.out.println(ans);


        boolean ans2 = e.isEquilbrium2(arr);
        System.out.println(ans2);
    }
}
