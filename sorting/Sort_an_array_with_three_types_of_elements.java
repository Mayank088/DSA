package sorting;
//this type of question ask in three type like
//1) sort an array with 0s , 1s, and 2s

//2) three way partition
//ex. i/p = {2,1,2,20,10,20,1}  , pivot = 2
//then we need to fist less then pivot then all the pivot together then greather then pivot
//o/p : 1 1 2 2 20 10 20

//3) partition around range
// i/p = {10,5,6,3,20,9,40}  , range=[5,10]
//fist less then 5 then between 5 to 10 then greather then 10
//o/p : 3,5,6,9,10,20,40
public class Sort_an_array_with_three_types_of_elements
{
    public static void sort(int arr[])       //time : O(n) , space : O(n)
    {
        int n = arr.length;
        int temp[] = new int[n];
        int index = 0;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i]==0)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i]==1)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i]==2)
            {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i=0 ; i<n ; i++)
        {
            arr[i] = temp[i];
        }
    }

    //efficient sol for three way partition  (dutch netional flag algo.)
    public static void sort2(int arr[] , int pivot)      //time : O(n) , space :O(1)
    {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid<= high)
        {
            if (arr[mid]<pivot)
            {
                //swap(arr[low] , arr[mid])    low++ , mid++
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==pivot)
            {
                mid++;
            }
            else
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    //effiecint sol for 0s,1s,2s
    public static void sort3(int arr[])
    {
        int mid = 0;
        int low = 0;
        int high = arr.length-1;

        while (mid<=high)
        {
            if (arr[mid]==0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {0,1,1,2,0,1};
        sort(arr);
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int arr2[] = {2,1,2,20,10,20,1};
        int pivot = 2;
        sort2(arr2,pivot);
        for (int i=0 ; i<arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }

    }
}
