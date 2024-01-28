package sorting;


//time : O(n*logn) in all cases.
public class Heap_sort {

    public static void build_maxHeap(int arr[])
    {
        int n = arr.length;

        for (int i=(n-2)/2 ; i>=0  ; i--)
        {
            heapify(arr,n,i);
        }
    }

    public static void heapify(int arr[] , int n , int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest])
        {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest])
        {
            largest = right;
        }

        if (largest != i)
        {
            //swap(arr[i] , arr[largest])
            //heapify(arr, n , largest)
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);
        }
    }

    public static void Heap_sort(int arr[])
    {
        int n = arr.length;
        build_maxHeap(arr);

        for (int i=n-1 ; i>0 ; i--)
        {
            //swap(arr[0] , arr[i])
            //heapify(arr,i,0)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,7,1,9};
        Heap_sort(arr);
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
