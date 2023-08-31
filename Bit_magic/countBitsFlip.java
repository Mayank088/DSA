package Bit_magic;

public class countBitsFlip {
    
    int count_bit_flip1(int a , int b){
        int count=0;
        int x = a ^ b;            //Time Complexity: O(log N),   Auxiliary Space: O(1).
        while (x!=0){
            int remainder = x % 2;
            if (remainder==1){
               count++;
            }
           x = x >> 1;
        }
        return count;
    }


    int count_bit_flip2(int a , int b){
        int count=0;
        int x = a ^ b;            //Time Complexity: O(log N),   Auxiliary Space: O(1).
        while (x!=0){
            if ((x&1)==1){
                count++;
            }
            x = x >> 1;
        }
        return count;
    }


    public static void main(String args[]){
        int a = 10;
        int b = 20;

        countBitsFlip c = new countBitsFlip();
        int ans = c.count_bit_flip1(a,b);
        System.out.println(ans);

        int ans2 = c.count_bit_flip2(a,b);
        System.out.println(ans2);
    }

}
