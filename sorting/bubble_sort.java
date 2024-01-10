package sorting;


//in-place , stable
public class bubble_sort {
    public static void bubble(int arr[])         // theta(n^2)   , space = theta(1)
    {
        int n = arr.length;
        for (int i = 0 ; i< n-1 ;i++)
        {
            for (int j = 0 ; j < n-i-1 ; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    // if element is already sorted then it is use
    public static void optimaize_bubble(int arr[])          // theta(n)
    {
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++)
        {
            boolean swapped = false;
            for (int j=0 ; j<n-i-1 ; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if (swapped = false)
            {
                break;
            }
        }
    }



    public static void main(String[] args)
    {
        int arr[] =  {10,9,11,6,15,2};
        bubble(arr);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
