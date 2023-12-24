package Searching;

public class Peak_element
{
    public static void peakElement1(int arr[])       //time = O(n) , space = O(1)
    {
        int n = arr.length;
        for (int i=1 ; i<n-1 ;i++)
        {
            if (arr[i-1] < arr[i] && arr[i+1] < arr[i])
            {
                System.out.println(arr[i] + " is peak element");
            }
        }


        if(n==1)
        {
            System.out.println(arr[0] + " is peak element");
        }
        if (arr[0] > arr[1])
        {
            System.out.println(arr[0] + " is peak element");
        }
        if (arr[n-1] > arr[n-2])
        {
            System.out.println(arr[n-1] + " is peak element");
        }
    }


    //using binary search

    public static int findPeak(int arr[] , int start , int end)    //time O(logn)
    {
        int n = arr.length;
        if(start <= end)
        {
            int mid = ( start + end) / 2;
            //ex = 1,5,20,10,15,17,18
            if ((mid == 0 || arr[mid-1] <= arr[mid] ) && (mid == n-1 || arr[mid+1] <= arr[mid]))
            {
                return mid;
            }
            else if (mid > 0 && arr[mid - 1] > arr[mid])
            {
                return findPeak(arr,start,mid-1);
            }
            else
            {
                return findPeak(arr,mid+1,end);
            }
        }
        return -1;
    }


    public static int peakelement2(int arr[])
    {
        int n = arr.length;
        int peakElement = arr[0];
        int peakIndex = 0;

        for (int i = 1 ; i<n ; i++)
        {
            if (arr[i] > peakElement)
            {
                peakElement = arr[i];
                peakIndex = i;
            }
            else
            {
                break;
            }
        }

        if (peakIndex > 0)
        {
            return peakIndex;
        }
        else
        {
            return 0;
        }
    }


    public static void main(String[] args)
    {
        int arr[] = {5, 10, 20, 15};

        peakElement1(arr);

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = findPeak(arr,start , end);
        System.out.println(ans);

        int ans2 = peakelement2(arr);
        System.out.println(ans2);
    }
}
