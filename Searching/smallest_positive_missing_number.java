package Searching;

public class smallest_positive_missing_number {

    public static int missing_positive_num(int arr[])      //time O(n)
    {
        int n = arr.length;
        int count = 1;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i]>0 && arr[i]==count)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {-10,0,-20,5,2};
        int ans = missing_positive_num(arr);
        System.out.println(ans);

        int arr2[] = {1,2,3,4,5,6};
        int ans2 = missing_positive_num(arr2);
        System.out.println(ans2);

        int arr3[] = {-10,1,-20,5,2,0};
        int ans3 = missing_positive_num(arr3);
        System.out.println(ans3);
    }
}
