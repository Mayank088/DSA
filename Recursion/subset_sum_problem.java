package Recursion;

// i/p : arr = {1,2,3}  , sum = 4
// o/p : 1
//{1,2,3} no ssubset find karvano pachi tema ti kai pair che jeno sum = 4 thay tevi ketli pair che te
// ans return karvo {1,3} aa ek pair madi

// i/p : arr = {10,5,2,3,6}  , sum = 8
// o/p : 2    ==> {5,3} , {2,6}
public class subset_sum_problem {
    int count_sunset(int arr[] , int n , int sum){
        if (n==0){                      //time complexity : theta(2^n)
            return (sum==0)? 1:0;
        }
        return count_sunset(arr , n-1 , sum) + count_sunset(arr , n-1 , sum - arr[n-1]);
    }
    public static void main(String[] args) {
        subset_sum_problem s = new subset_sum_problem();
        int arr[] = {1,2,3};
        int n = arr.length;
        int sum = 4;
        int ans = s.count_sunset(arr,n,sum);
        System.out.println(ans);

        int arr1[] = {10,5,2,3,6};
        int n1 = arr1.length;
        int sum1 = 8;
        int ans1 = s.count_sunset(arr1,n1,sum1);
        System.out.println(ans1);
    }
}
