package sorting;

public class merge_sort
{
    //Time complexity of Merge Sort is Θ(nLogn) in all 3 cases (worst, average and best) , Auxiliary Space: O(n)
    public static void MergeSort(int arr[] , int l , int r)  //T(n) = 2T(n/2) + Θ(n) => Θ(nLogn).
    {
        if (r > l)
        {
            int mid = l +(r-l)/2;

            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int arr[], int l , int mid , int r)
    {
        int n = (mid-l)+1;
        int m = (r-mid);
        int left[] = new int[n];
        int right[] = new int[m];

        for (int i=0 ; i<n ; i++)
        {
            left[i] = arr[l+i];
        }
        for (int i=0 ; i<m ;i++)
        {
            right[i] = arr[mid+i+1];
        }

        int i=0;
        int j=0;
        int k=l;
        while (i<n && j<m)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<n)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<m)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10,5,30,15,7};
        int l=0;
        int r=4;
        MergeSort(arr,l,r);
        for (int i=0; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
