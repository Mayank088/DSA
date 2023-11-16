package Searching;

public class TernarySearch
{
    public static int ternary_Search(int arr[] , int key)
    {                                   //time = O(logn)    here (log 3 n)
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end)
        {
            int mid1 = start + ((end - start)/3);
            int mid2 = end - ((end - start)/3);

            if(arr[mid1] == key)
            {
                return mid1;
            }
            if (arr[mid2] == key)
            {
                return mid2;
            }

            if (key < arr[mid1])
            {
                end = mid1 - 1;
            }
            else if (arr[mid2] < key)
            {
                start = mid2 + 1;
            }
            else
            {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }

    //it is also Implementation using recursion.
    public static int ternary_Search_recursion(int start , int end , int arr[] , int key)
    {                                   //time = O(logn)    here (log 3 n)
        while (start <= end)
        {
            int mid1 = start + ((end - start)/3);
            int mid2 = end - ((end - start)/3);

            if(arr[mid1] == key)
            {
                return mid1;
            }
            if (arr[mid2] == key)
            {
                return mid2;
            }

            if (key < arr[mid1])
            {
                return ternary_Search_recursion(start , mid1-1 , arr , key);
            }
            else if (arr[mid2] < key)
            {
                return ternary_Search_recursion(mid2+1 , end, arr , key);
            }
            else
            {
                return ternary_Search_recursion(mid1+1 , mid2-1 , arr , key);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 11;

        int ans = ternary_Search(arr, key);
        System.out.println(ans);
    }
}
