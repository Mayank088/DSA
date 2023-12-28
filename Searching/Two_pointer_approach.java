package Searching;

public class Two_pointer_approach {

    public static boolean findSum(int arr[] , int sum)         //time O(n^2)
    {
        int n = arr.length;
        for (int i = 0 ; i<n-1 ; i++)
        {
            for (int j = i+1 ; j<n ; j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean findSum2(int arr[] , int sum)       //time O(n) , space = O(1)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start<end)
        {
            if (arr[start] + arr[end] == sum)
            {
                return true;
            }
            else if (arr[start] + arr[end] > sum)
            {
                end = end-1;
            }
            else
            {
                start = start + 1;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {2,4,8,9,11,12,20,30};
        int sum = 23;

        boolean ans = findSum2(arr,sum);
        System.out.println(ans);
    }
}
