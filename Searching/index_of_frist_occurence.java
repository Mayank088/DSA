package Searching;

public class index_of_frist_occurence {

    public static int first_occurence(int arr[] , int x)
    {
        int n = arr.length;
        for (int i=0; i<n ; i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }


    public static int first_occurence2(int arr[] , int x , int start , int end)   //time O(logn) , space O(n) , overhead
    {

            if(start>end)
            {
                return -1;
            }

            int mid = (start + end) / 2;

            if (arr[mid] < x)
            {
                return first_occurence2(arr,x,mid+1,end);
            }
            else if (arr[mid] > x)
            {
                return first_occurence2(arr,x,start,mid-1);
            }
            else
            {
                if (mid == 0 || arr[mid - 1] != arr[mid])   //mid and mid-1 sarkha nathi to mid j first occure hase.
                {
                    return mid;
                }
                //{1,2,2,2,2,2,3}
                else     //mid and mid-1 bei sakrha hase to left side j javanu aapde first occure joi che atle
                {
                    return first_occurence2(arr, x, start, mid - 1);
                }
            }
    }


    public static int first_occurence3(int arr[] , int x)   //time O(logn) , space = O(1)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start<=end)
        {
            int mid = (start+end) / 2;

            if (arr[mid] < x)
            {
                start = mid+1;
            }
            else if (arr[mid] > x)
            {
                end = mid-1;
            }

            else
            {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                {
                    return mid;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int arr[] = {1,10,10,10,20,20,30};
        int x= 20;

        int ans = first_occurence(arr,x);
        System.out.println(ans);

        int n = arr.length;
        int start = 0;
        int end = n-1;

        int ans2 = first_occurence2(arr,x,start ,end);
        System.out.println(ans2);

        int ans3 = first_occurence3(arr,x);
        System.out.println(ans3);
    }
}
