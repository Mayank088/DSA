package sorting;

public class QuickSort_using_lomuto
{
    public static void QuickSort(int arr[] , int low , int high)
    {
        if (low<high)
        {
            int p = lomuto_partition(arr,low,high);
            QuickSort(arr,low,p-1);
            QuickSort(arr,p+1 , high);
        }
    }
    public static int lomuto_partition(int arr[] , int low , int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for (int j=low ; j<=high-1 ; j++)
        {
            if (arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args)
    {
        int arr[] = {8,4,7,9,3,10,5};
        int low = 0;
        int high = arr.length-1;

        QuickSort(arr,low,high);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
