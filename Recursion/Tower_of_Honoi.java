package Recursion;


//n = 3 then step to find move is (2^n)-1
public class Tower_of_Honoi {
    void TOH(int n, String A ,String B ,String C){
        if (n==1){
            System.out.println("Move " + n + " from " +  A + " to " + C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n-1,B,A,C);
    }

    public static void main(String[] args) {
        Tower_of_Honoi t = new Tower_of_Honoi();
        t.TOH(3 ,"a","b","c");

    }
}
