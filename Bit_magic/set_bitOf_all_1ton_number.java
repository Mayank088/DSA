package Bit_magic;

public class set_bitOf_all_1ton_number {

    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){

        // Your code here
        if(n==0)
        {
            return 0;
        }

        int pow = 0;
        int temp = n;

        while(temp>1){
            temp = temp >> 1;
            pow++;
        }
        return (int)Math.pow(2, pow-1)*pow + n-(int)Math.pow(2, pow) + 1 + countSetBits(n-(int)Math.pow(2, pow));
    }



    public static void main(String args[]){
        set_bitOf_all_1ton_number s = new set_bitOf_all_1ton_number();
        int ans =  s.countSetBits(4);

        System.out.println(ans);
    }
}
