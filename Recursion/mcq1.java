package Recursion;

public class mcq1 {
    int fun (int n){
        if (n==4){
            return n;
        }
        else {
            return (2 * fun(n+1));
        }
    }
    public static void main(String args[]){
        mcq1 m = new mcq1();
        int ans = m.fun(2);
        System.out.println(ans);
    }
}
