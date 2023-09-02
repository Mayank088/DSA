package Bit_magic;

public class grayConveter {
    int ingray(int n){
        return n ^ (n>>1);
    }

    public static void main(String args[]){
        grayConveter g = new grayConveter();
        int ans = g.ingray(10);
        System.out.println(ans);
    }
}
