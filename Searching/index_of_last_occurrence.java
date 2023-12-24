package Searching;

public class index_of_last_occurrence {

    int lastOccurrence(int arr[] , int x)
    {
        int n = arr.length;
        for (int i = n-1 ; i>=0 ; i--)
        {
            if (arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrence2(int arr[] , int x , int start , int end)
    {
        int n = arr.length;
        if (start>end)
        {
            return -1;
        }

        int mid = (start+end)/2;

        if (arr[mid] < x)
        {
            return lastOccurrence2(arr,x,mid+1 ,end);
        }
        else if (arr[mid] > x)
        {
            return lastOccurrence2(arr,x,start,mid-1);
        }
        else
        {
            if (mid==n-1 || arr[mid+1] != arr[mid])
            {
                return mid;
            }
            else
            {
               return lastOccurrence2(arr,x,mid+1 ,end);
            }

        }

    }

    public static int lastOccurrence3(int arr[] , int x)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start<=end)
        {
            int mid = (start+end)/2;

            if (arr[mid] < x)
            {
                start = mid+1;
            }
            else if(arr[mid] > x)
            {
                end = mid-1;
            }
            else
            {
                if (mid==n-1 || arr[mid+1] != arr[mid])
                {
                    return mid;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,3,4,10,10,10,11,15};
        int x = 10;

        index_of_last_occurrence l = new index_of_last_occurrence();
        int ans = l.lastOccurrence(arr,x);
        System.out.println(ans);


        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans2 = lastOccurrence2(arr,x,start,end);
        System.out.println(ans2);

        int ans3 = lastOccurrence3(arr,x);
        System.out.println(ans3);
    }
}
