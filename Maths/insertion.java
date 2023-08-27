public class insertion
{
    static void insertion_sort(int arr[]){
        int len = arr.length;

        for (int i=1 ; i<len;i++){
            int j = i-1;
            int key = arr[i];

            while (j>=0 && j<key){
                arr[j+1] = j;
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){
        int arr[] = {9,5,1,4,6};
        insertion_sort(arr);
    }
}
