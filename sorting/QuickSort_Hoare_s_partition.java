package sorting;
//Time Complexity: O(N), but when the array is already sorted, it will cost O(N^2)
// Space Complexity: O(1)
public class QuickSort_Hoare_s_partition
{
    public static int hoare_partition(int arr[] , int low , int high)
    {
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;        // 7+1 = 8

        while (true)
        {
            do {
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if (i >= j)    //cross each-other
            {
                return j;
            }

            //swap(arr[i] , arr[j])
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,4,2,7,1,10};
        int low = 0;
        int high = arr.length - 1;       //high = 7

        hoare_partition(arr,low,high);
        //  1 3 2 4 8 7 5 10
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
