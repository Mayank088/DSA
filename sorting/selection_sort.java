package sorting;

public class selection_sort {
    public static void selection(int arr[])
    {
        int n = arr.length;

        for (int i=0 ; i<n ; i++)
        {
            int min = i;
            for (int j=i+1 ; j<n ;j++)
            {
                if (arr[min] > arr[j])
                {
                    min = j;
                }
            }


        }
    }


    public static void main(String[] args)
    {

    }
}
