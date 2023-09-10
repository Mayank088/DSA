package Recursion;

public class fibnacci {

    int fib(int n){
        if (n==1 || n==2){
            return 1;
        }
        else{
            return (fib(n-1) + fib(n-2));
        }
    }


    public static void main(String args[]){
        fibnacci f = new fibnacci();
        int ans = f.fib(20);
        System.out.println(ans);
    }
}
