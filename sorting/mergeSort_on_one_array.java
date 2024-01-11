package sorting;


//i/p :  int arr[] = {10,15,20,11,30};
//        int low = 0;
//        int mid = 2;
//        int high = 4;

//here low to mid is sorted and mid+1 t0 high is sorted
//task is to sort all in incresing order.

//o/p : 10,11,15,20,30
public class mergeSort_on_one_array {

    public static void merge_sort(int arr[] , int low , int mid , int high)  //time: O(n) , aux space : O(n)
    {
        int n = mid-low+1;    //mid+1
        int m = high-mid;
        int left[] = new int[n];
        int right[] = new int[m];

        for (int i=0 ; i<n ; i++)
        {
            left[i] = arr[low+i];
        }
        for (int j=0 ; j<m ; j++)
        {
          right[j] = arr[mid+j+1];
        }


        int i=0;
        int j=0;
        int k=0;
        while (i<n && j<m)
        {
            if (left[i] >= right[j])
            {
                System.out.print(right[j] + " ");
                k++;
                j++;
            }
            else
            {
                System.out.print(left[i] + " ");
                k++;
                i++;
            }
        }

        while (i<n)
        {
            System.out.print(left[i] + " ");
            k++;
            i++;
        }
        while (j<m)
        {
            System.out.print(right[j] + " ");
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,11,30};
        int low = 0;
        int mid = 2;
        int high = 4;

        merge_sort(arr,low,mid,high);


    }
}
