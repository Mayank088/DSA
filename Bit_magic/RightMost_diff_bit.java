package Bit_magic;

public class RightMost_diff_bit {

    int rightmost_bit(int m, int n){
        return position(m ^ n);
    }

    int position(int num){
        for (int i=0;i<=32;i++){
            int x = (num>>i);
            if((x&1)!=0) {
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int m = 52;
        int n = 4;

        RightMost_diff_bit r = new RightMost_diff_bit();
        int ans = r.rightmost_bit(m,n);

        System.out.println(ans);
    }
}
