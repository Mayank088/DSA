package Recursion;

public class mcq3_binary_repratation {

    void fun(int n){
        if (n==0){
            return;
        }
        else {
            System.out.print(n%2);
            fun(n/2);
        }
    }

    public static void main(String args[]){
        mcq3_binary_repratation m = new mcq3_binary_repratation();
        m.fun(25);
    }
}
