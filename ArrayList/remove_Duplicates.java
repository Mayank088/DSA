package ArrayList;

//Remove duplicates from a sorted array

//In a realm where numbers hold secrets, a captivating challenge awaits, which is to,
// Remove Duplicates from a Sorted Array !!!

//Our Task: Given a sorted array, the task is to remove the duplicate elements from the array.


//Input  : arr[] = {2, 2, 2, 2, 2}
//Output : arr[] = {2}
//new size = 1

// Input  : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
// Output : arr[] = {1, 2, 3, 4, 5}
//new size = 5
public class remove_Duplicates
{

    public static int rmvDupt(int arr[])
    {                                   //time : O(n)   , aux : O(n)
        int n = arr.length;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i=1 ; i<n ; i++)
        {
            if (temp[res-1] != arr[i])
            {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i=0 ; i<res ; i++)
        {
            arr[i] = temp[i];
        }
        return res;
    }


    //or (Efficient)
    public static int rmvDupt2(int arr[])
    {                                           //time : O(n)   , aux : O(1)
        int n = arr.length;
        int res = 1;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i] != arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {10 , 20, 20 , 30 , 30 , 30};
        rmvDupt2(arr);   //we are done here


        //extra work.. only above is enough
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        n = rmvDupt(arr);            //calling function

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        // ans = 3 => {10,20,30}
    }
}
