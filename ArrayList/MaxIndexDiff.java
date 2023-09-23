package ArrayList;

public class MaxIndexDiff
{
    public static int maxindex(int arr[])
    {
        int n = arr.length;

        int maxIndex = 0;
        for (int i=0 ; i<n ;i++)
        {
            for (int j=i+1; j<n ; j++ )
            {
                if (arr[i] <= arr[j])
                {
                    int temp = j - i;
                    maxIndex = Math.max(temp , maxIndex);
                }
            }
        }
        return maxIndex;
    }

    public static int maxindex1(int arr[])
    {
        int n = arr.length;

        int maxIndex = 0;
        for (int i=0 ; i<n ;i++)
        {
            for (int j=n-1; j>i ; j-- )
            {
                if (arr[i] <= arr[j])
                {
                    int temp = j - i;
                    maxIndex = Math.max(temp , maxIndex);
                }
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int ans = maxindex(arr);
        System.out.println(ans);

        int ans2 = maxindex1(arr);
        System.out.println(ans2);
    }
}
