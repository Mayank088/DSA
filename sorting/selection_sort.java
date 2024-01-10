package sorting;

public class selection_sort {

    public static void selection(int arr[])
    {
        int n = arr.length;

        for (int i=0 ; i<n ; i++)
        {
            int min = i;
            for (int j=i+1 ; j<n ; j++)
            {
                if (arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    public static void main(String[] args)
    {
        int arr[] = {5,2,90,1,54,22,30};
        selection(arr);
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
