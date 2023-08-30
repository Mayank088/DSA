package Bit_magic;

public class missing_num {

    int missNUm(int arr[] , int n){
        {
            int x1 = arr[0];
            int x2 = 1;

            // For xor of all the elements in array
            for (int i = 1; i < n; i++)
                x1 = x1 ^ arr[i];

            // For xor of all the elements from 1 to n+1
            for (int i = 2; i <= n + 1; i++)
                x2 = x2 ^ i;

            return (x1 ^ x2);
        }
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,5};
        int n = arr.length;

        missing_num m = new missing_num();
        int ans = m.missNUm(arr,n);

        System.out.println(ans);
    }

}
