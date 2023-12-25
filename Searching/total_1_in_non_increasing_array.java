package Searching;

public class total_1_in_non_increasing_array {

    public static int total_One(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid=0;
        int count = 0;

        while (start<=end)
        {
            mid = (start+end)/2;

            if (arr[mid]==1)
            {
                start = mid+1;
                count = mid+1;
            }

            if (arr[mid]==0)
            {
                end = mid-1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,0};

        int ans = total_One(arr);
        System.out.println(ans);

    }
}
