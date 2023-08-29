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


    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits2(int n){

        n = n+1;                 //Ignoring 0 as all the bits are unset.
        int count=0;

        for (int x=2; x/2<n; x=x*2){        //Counting set bits from 1 to n.
            int quotient = n/x;          //Total count of pairs of 0s and 1s

            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.

            count +=  quotient * x / 2;

            int remainder = n%x;

            //If the count of pairs is odd then we add the remaining 1s
            //which could not be grouped together.

            if(remainder > x/2) {
                count += remainder - x / 2;
            }
        }
        //returning count of set bits.
        return count;
    }


    public static void main(String args[]){
        set_bitOf_all_1ton_number s = new set_bitOf_all_1ton_number();

        int ans =  s.countSetBits(4);
        System.out.println(ans);

        int ans2 = s.countSetBits2(4);
        System.out.println(ans2);

    }
}
