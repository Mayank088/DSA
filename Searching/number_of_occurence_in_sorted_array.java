package Searching;

public class number_of_occurence_in_sorted_array {

    int occurence(int arr[] , int x)      //time = O(n)  , space = O(1)
    {
        int n = arr.length;
        int count = 0;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i] == x)
            {
                count++;
            }
        }
        return count;
    }


    //second approch using binary search

    public static int first_occurence(int arr[] , int x , int start , int end)     //time O(logn)
    {

        if (start <= end)
        {
            int mid = (start + end) / 2;

            if (mid == 0 || arr[mid-1] < x && arr[mid] == x)
            {
                return mid;          //aagd ni index par x ti nano hoy ane mid par j x chalu thato
                                     // hoy to first_occurence mid j thay ne arr ={1,1,2,2,3} , x = 2 ahi chalu j mid ti thay che
            }

            else if (x > arr[mid])
            {
                return first_occurence(arr , x , mid+1 , end);
            }
            else
            {
                return first_occurence(arr, x , start , mid-1);
            }
        }
        return -1;
    }


    public static int last_occurence(int arr[] , int  x , int start , int end)
    {
        if (start <= end)
        {
            int mid = (start + end) / 2;
            //arr ={1,1,1,2,2,3} , x = 1
            if (mid == 0 || arr[mid+1] > x && arr[mid] == x)
            {
                return mid;
            }
            else if (x > arr[mid])
            {
                return last_occurence(arr, x , mid+1 , end);
            }
            else
            {
                return last_occurence(arr, x, start , mid-1);
            }
        }
        return -1;
    }

    public static int occurence_using_binarySearch(int arr[] , int x)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        int i = first_occurence(arr , x, start , end);
        int j = last_occurence(arr, x, start,end);

        int count  = i - j + 1;
        return count;
    }




    public static void main(String[] args)
    {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        number_of_occurence_in_sorted_array n = new number_of_occurence_in_sorted_array();
        int ans = n.occurence(arr , x);
        System.out.println(x + " occurence in array is " + ans + " times.");


        int ans2 = occurence_using_binarySearch(arr ,x);
        System.out.println(ans2);
    }
}
