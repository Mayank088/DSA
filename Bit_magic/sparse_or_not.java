package Bit_magic;

//Given a number N. The task is to check whether it is sparse or not. A number is said to be a
//sparse number if no two or more consecutive bits are set in the binary representation.


//Input: N = 2
//Output: 1
//        Explanation: Binary Representation of 2 is 10,
//        which is not having consecutive set bits.
//        So, it is sparse number.


//Input: N = 3
//Output: 0
//        Explanation: Binary Representation of 3 is 11,
//        which is having consecutive set bits in it.
//        So, it is not a sparse number.

public class sparse_or_not {

    boolean isSparse(int n){
        int oddbits = n & 0x55555555;
        while (n>0){
            if (oddbits==1){
                return false;
            }
            else {
                n = oddbits>>1;
            }
        }
        return true;
    }

    boolean isSparse2(int n){
        int res = n & (n>>1);
        if (res==0){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String args[]){
        sparse_or_not s = new sparse_or_not();
        boolean ans = s.isSparse(2);
        System.out.println(ans);

        boolean ans2 = s.isSparse2(7);       //111 is not sparse
        System.out.println(ans2);
    }
}
