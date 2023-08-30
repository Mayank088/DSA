package Bit_magic;

public class find_odd_occuring
{
    int findOdd(int arr[] , int n) {       //time : O(n^2)
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return arr[i];
            }
        }
        return 0;
    }

    int findOdd2(int arr[] , int n){     //time : O(n)
        int res = arr[0];
        for (int i=1;i<n;i++){
            res = res ^ arr[i];            //res = 4 ^ 3 ^ 4 ^ 4 ^ 4 ^ 5 ^ 5  ==> return 3
        }
        return res;
    }



    public static void main(String args[]){
        int arr[] = {4,3,4,4,4,5,5};
        int n = arr.length;

        find_odd_occuring f = new find_odd_occuring();

        int ans = f.findOdd(arr,n);
        System.out.println(ans);

        int ans2 = f.findOdd2(arr,n);
        System.out.println(ans2);

    }
}
