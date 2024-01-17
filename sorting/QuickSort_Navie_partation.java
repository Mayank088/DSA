package sorting;

//naive partation is stable
public class QuickSort_Navie_partation
{
    public static void partation(int arr[] , int low , int high , int p) //time:O(n) , space O(n)
    {
        int temp[] = new int[high-low+1];
        int index = 0;
        for (int i=low ; i<arr.length ; i++)
        {
            if (arr[i]<=arr[p])
            {
                temp[index] = arr[i];
                index++;
            }
        }

//        temp[index++] = arr[p];

        for (int i=low ; i<arr.length ; i++)
        {
            if (arr[i]>arr[p])
            {
                temp[index] = arr[i];
                index++;
            }
        }

        //copy temp element's in original array
        for (int i=low ; i<arr.length ; i++)
        {
            arr[i] = temp[i-low];
        }
    }


    public static void main(String[] args)
    {
        int arr[] = {5,13,6,9,12,11,8};
        int low = 0;
        int high = arr.length-1;
        int p = arr.length-1;

        partation(arr,low,high,p);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
