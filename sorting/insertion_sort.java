package sorting;

public class insertion_sort {

    public static void insertion(int arr[])
    {
        int n = arr.length;

        for (int i = 1 ; i<n ; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }


    public static void main(String[] args) {
        int arr[] = {10,2,1,3,13,7,9};
        int n=arr.length;
        insertion(arr);
        for (int i=0 ; i<n ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
