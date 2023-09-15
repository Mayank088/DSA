package Recursion;

public class Tower_of_Honoi {
    void TOH(int n, String a ,String b ,String c){
        if (n==1){
            System.out.println("Move " + n + " from " + a + " to " + c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        TOH(n-1,b,a,c);
    }

    public static void main(String[] args) {
        Tower_of_Honoi t = new Tower_of_Honoi();
        t.TOH(3 ,"a","b","c");
    }
}
