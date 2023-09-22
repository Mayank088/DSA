package ArrayList;

public class merge2SortedArray {

    public static void mergeArrays(int[] arr1, int[] arr2, int n, int m, int[] arr3)
    {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i<n && j<m)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
            {
                arr3[k] = arr1[i];    // aam pan laki saki arr3[k++] = arr1[j++];
                k++;
                i++;
            }
            else{           //arr1[i] > arr[j]
                arr3[k++] = arr2[j++];
            }
        }

        // Store remaining elements of first array
        //raiming array1 ma vadhiya hoy ekey element to te jya sudhi array che te badha arr3 ma add kari nakvana
        while (i < n){
            arr3[k++] = arr1[i++];
        }

        // Store remaining elements of second array
        //raiming array2 ma vadhiya hoy ekey element to te jya sudhi array che te badha arr3 ma add kari nakvana
        while (j < m){
            arr3[k++] = arr2[j++];
        }
    }


    void print(int ans[] , int n){
        for (int i=0 ; i<n ; i++){
            System.out.print(ans[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr1[] = {1,3,4,6};
        int arr2[] = {2,5,7,8};

        int n = arr1.length;
        int m = arr2.length;

        int arr3[] = new int[n+m];
        int k = arr3.length;

        merge2SortedArray e = new merge2SortedArray();
        e.mergeArrays(arr1,arr2,n,m,arr3);
        e.print(arr3,k);
    }
}
