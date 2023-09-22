package ArrayList;

//range sum queries using prefix sum
// Input
// [4, 5, 3, 2, 5]
// 3   (number of queries)
// 0 3
// 2 4
// 1 3
// Output
//  14 ( index 0 to 3 => 4+5+3+2 = 14)
//  10 ( index 2 to 4 => 3+2+5 = 10)
//  10 ( index 1 to 3 => 5+3+2 = 10)
public class range_sum_queries {
    public static void preCompute(int arr[] ,int prefix[] ,  int n)
    {
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++){
            prefix[i] = arr[i] + prefix[i - 1];
        }
    }
    public static int rangeSum(int l, int r, int pre[])
    {
        if (l == 0)
        {
            return pre[r];
        }
        else
        {
        return pre[r] - pre[l - 1];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int pre[] = new int[n];

        preCompute(arr, pre , n);
        System.out.println(rangeSum(1, 3, pre));
        System.out.println(rangeSum(2, 4, pre));
        System.out.println(rangeSum(0, 3, pre));
    }
}
