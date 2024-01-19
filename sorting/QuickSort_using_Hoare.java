package sorting;

public class QuickSort_using_Hoare
{
    public static void QuickSort_hoare(int arr[] , int low , int high)
    {
        if (low<high)
        {
            int pivot = Hoare_partition(arr,low,high);
            QuickSort_hoare(arr,low,pivot);
            QuickSort_hoare(arr,pivot+1 , high);
        }
    }

    public static int Hoare_partition(int arr[] , int low , int high)
    {
        int pivot = arr[low];
        int i=low-1;
        int j=high+1;

        while (true)
        {
            do {
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if (i>=j)
            {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {8,4,7,9,3,10,5};
        int low = 0;
        int high = arr.length-1;

        QuickSort_hoare(arr,low,high);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
