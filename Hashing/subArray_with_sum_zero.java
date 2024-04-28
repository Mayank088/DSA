package Hashing;

import java.util.HashSet;

//arr[] = {4,-3,2,1}
// o/p = true    because -3+2+1 = 0
//subarray means contiguous element.
public class subArray_with_sum_zero {

    public boolean sumIsZero(int arr[])      //time = O(n^2) , space = O(1)
    {
        int n = arr.length;

        for (int i=0 ; i<n ; i++)
        {
            int currSum = 0;
            for (int j=i ; j<n ; j++)
            {
                currSum = currSum + arr[j];
                if (currSum==0)
                {
                    return true;
                }
            }
        }
        return false;
    }


    //use preFix_sum and HashTable

    public static boolean sumIsZero_using_prefix_and_Hashing(int arr[])    //time O(n) , space O(n)
    {
        int n=arr.length;
        HashSet<Integer> h = new HashSet<>();

        int preFixSum = 0;

        for (int i=0 ; i<n ; i++)
        {
            preFixSum = preFixSum + arr[i];

            if (h.contains(preFixSum))
            {
                return true;
            }
            if (preFixSum == 0)
            {
                return true;
            }
            h.add(preFixSum);
        }

        return false;
    }


    public static void main(String[] args) {
        int arr[] = {4,-3,2,1};
        subArray_with_sum_zero s = new subArray_with_sum_zero();
        boolean ans = s.sumIsZero(arr);
        System.out.println(ans);

        boolean ans2 = sumIsZero_using_prefix_and_Hashing(arr);
        System.out.println(ans2);
    }
}
