package sorting;

//if piovt is givan in problem statment then we swap to pivot in last element then start lomuto partation.
public class QuickSort_Lomuto_partition
{
    public static int QuickSort_Lomuto_partiton(int arr[] , int low , int high)      //time O(n) , space O(1)
    {
        //assume that pivot is always last element
        //if not then swap pivot to last element

        int pivot = arr[high];

        int i=low-1;
        for (int j=low ; j<=high-1 ; j++)
        {
            if (arr[j]<pivot)
            {
                i++;
                //swap(arr[i],arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot to place it's original place of pivot
        // ==> swap(arr[i+1], pivot) or swap(arr[i+1], arr[high])
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args)
    {
        int arr[] = {10,80,30,90,40,50,70};
        int low = 0;
        int high = arr.length-1;

        QuickSort_Lomuto_partiton(arr,low,high);   //10 30 40 50 70 90 80

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
