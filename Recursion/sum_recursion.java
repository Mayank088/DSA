package Recursion;

public class sum_recursion {
    int sum(int n){
        if (n==0){
            return 0;           //time complexity = theta(n) or T(n) = T(n-1) + theta(1)
        }                       //aux space = theta(n)
        else {
            return n + sum(n-1);
        }
    }

    //not a recursion
    int sum2(int n){
        return n * ((n+1)/2);
    }

    public static void main(String args[]){
        sum_recursion s = new sum_recursion();
        int ans = s.sum(10);
        System.out.println(ans);
    }
}
