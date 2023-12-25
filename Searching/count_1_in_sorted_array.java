package Searching;

public class count_1_in_sorted_array {

    public static int count_one(int arr[])
    {
        int n = arr.length;
        int start=0;
        for (int i=0; i<n ; i++)
        {
            if (arr[i]==1)
            {
                start = i;
                break;
            }
        }

        int ans = n - start;
        return ans;
    }


    public static int count_one2(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start<=end)
        {
            int mid = (start+end)/2;

            if (arr[mid] == 0)
            {
                start = mid + 1;
            }
            else
            {
                if (mid == 0 || arr[mid-1] != arr[mid])
                {
                    return (n-mid);
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1};

        int ans = count_one(arr);
        System.out.println(ans);

        int ans2 = count_one2(arr);
        System.out.println(ans2);
    }
}
