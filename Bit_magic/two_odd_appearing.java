package Bit_magic;

public class two_odd_appearing
{
    void two_odd_print(int arr[] ,int n){       //time : O(n^2)  , aux : O(1)
        for (int i=0; i<n; i++){
            int count=0;
            for (int j=0; j<n ;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }

    /* Prints two numbers that occur odd
        number of times. The function assumes
        that the array size is at least 2 and
        there are exactly two numbers occurring
        odd number of times. */
    void two_odd_print2(int arr[],int n){     //time : O(n)  , aux : O(1)

        int x = arr[0];

        for (int i=1;i<n;i++){
              x = x ^ arr[i];            // 2 diff hase teno j xor thase
        }

        int k = (x & (~(x-1)));     /* Get one set bit in the xor2. We get rightmost set bit in the following line as it is easy to get */

        int res1 = 0;
        int res2 = 0;


        /* Now divide elements in two sets:
			1) The elements having the corresponding bit as 1.
			2) The elements having the corresponding bit as 0. */

        for (int i=0;i<n;i++){
            if ((k & arr[i]) != 0){
                res1 = res1 ^ arr[i];
            }
            else {
                res2 = res2 ^ arr[i];
            }

        }
        System.out.println("res : "+ res1 + " res2 : " + res2);
    }



    public static void main(String args[]){
        int arr[] = {10,3,3,5};
        int n = arr.length;

        two_odd_appearing o = new two_odd_appearing();
        o.two_odd_print(arr,n);

        int arr1[] = {1,5,5,3,1,5};
        int n1 = arr1.length;

        o.two_odd_print2(arr1,n1);
    }
}
