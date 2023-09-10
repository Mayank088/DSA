package Recursion;

public class mcq5 {
    int fun(int n)
    {
        if (n<=1){
            return 1;
        }
        if ((n%2)==0){
            return fun(n/2);
        }
        else {
            return fun(n/2) + fun(n/(2+1));
        }
    }

    public static void main(String args[]){
        mcq5 m = new mcq5();
        int ans = m.fun(11);
        System.out.println(ans);
    }
}
