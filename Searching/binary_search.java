package Searching;

public class binary_search
{
    public static int search(int arr[] , int x)        //normal search for all the posiblity
    {                                                 //it is use for unsorted array.
        int n = arr.length;

        for (int i=0 ; i<n ; i++)
        {
            if (arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }


    //binary search (assume that array is sorted.)

    public static int search_binary(int arr[] , int x)
    {
        int n = arr.length;

        int start = 0;
        int end = n-1;

        while (start <= end)
        {
            int mid = (start + end)/2;

            if (arr[mid] == x)
            {
                return mid;
            }
            else if (arr[mid]> x)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }


    //recursive binary search
    public static int search_binary_recursive(int arr[] , int start , int end , int x)
    {
        if (start > end)
        {
            return -1;
        }
        int mid = (start + end)/2;
        if (arr[mid]==x)
        {
            return mid;
        }
        else if (arr[mid] > x)
        {
            return search_binary_recursive(arr , start , mid-1 , x);
        }
        else
        {
            return search_binary_recursive(arr , mid+1 , end , x);
        }
    }


    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int x = 5;

        int ans = search(arr,x);
        System.out.println(ans);

        int ans2 = search_binary(arr,x);
        System.out.println(ans2);

        //recursive binary
        int arr2[] = {10,20,30,40,50,60,70};
        int n = arr.length;
        int x2 = 20;
        int start = 0;
        int end = n-1;
        int ans3 = search_binary_recursive(arr2,start,end,x2);
        System.out.println(ans3);
    }
}
