package Searching;

public class rotated_sorted_array_find_x {

    public static int search(int arr[] , int x)      //time O(n) , space = O(1)
    {
        int n = arr.length;
        for (int i = 0 ; i<n ; i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }


    public static int search2(int arr[] , int x)           //time = O( log n )
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start<=end)
        {
            int mid = (start+end)/2;

            if (arr[mid]==x)
            {
                return mid;
            }

            if (arr[mid] >= arr[start])
            {
                if (arr[start]<=x  && arr[mid]>x)
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else
            {
                if (arr[mid]<x  && arr[end]>=x)
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args)
    {
        //sorted array j che but rotated che 3 var rotate kari atle normal sorted thay jai.
        int arr[] = {100,500,10,20,30,40,50};
        int x =500;

        int ans = search2(arr,x);
        System.out.println(ans);
    }
}
