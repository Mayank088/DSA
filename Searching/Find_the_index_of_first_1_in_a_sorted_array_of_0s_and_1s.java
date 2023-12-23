package Searching;

public class Find_the_index_of_first_1_in_a_sorted_array_of_0s_and_1s
{
    public static int first_one(int arr[])  //time = O(n) , space = O(1)
    {
        int n = arr.length;
        int i;
        for ( i=0; i<n ; i++) {
            if (arr[i] == 1)
            {
                break;
            }
        }
        return i;
    }


    //using binary search

    public static int first_one_binarySearch(int arr[] , int start , int end)  //time = O(logn)
    {
        int n = arr.length;

        if (start <= end)
        {
            int mid = (start + end) / 2;

            //if (mid == 0 || (arr[mid] == 1 && arr[mid - 1] == 0))
            //aa nahi chale beacuse mid = 0 jo 2 element hase to pan thase pan te {0,1} hoy to ans ma 1 aave
            //but te sidhu return mid kari dese or vadi condition jose j nai
            //atle aa niche che tem j lakvu to j sachu che

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0))
            {
                return mid;
            }
            else if (arr[mid] == 0)
            {
                return first_one_binarySearch(arr, mid+1 , end);
            }
            else
            {
                return first_one_binarySearch(arr , start , mid-1);
            }
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int arr[] = {0,0,0,0,1,1,1};
        int ans = first_one(arr);
        System.out.println(ans);

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans2 = first_one_binarySearch(arr , start , end);
        System.out.println(ans2);
    }
}
