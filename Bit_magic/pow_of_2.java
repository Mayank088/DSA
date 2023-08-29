package Bit_magic;

public class pow_of_2 {

    boolean is_pow_2(int n){
        if (n==0){
            return false;
        }
        while (n!=1){
            if (n%2!=0){
                return false;
            }
            n = n/2;
        }
        return true;
    }

    boolean is_pow2(int n){
        if (n==0){
            return false;
        }
        else {
            return ((n & (n-1))==0);
        }
    }



    public static void main(String args[]){
        pow_of_2 p = new pow_of_2();

        boolean ans = p.is_pow_2(5);
        System.out.println(ans);

        boolean ans2 = p.is_pow2(16);
        System.out.println(ans2);
    }
}
