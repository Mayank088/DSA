package Recursion;

public class base_case_ {
    static void fun1(int n){
        if (n==0){    // it is known as a termination condition or base case
            return;
        }
        System.out.println("fun1");
        fun1(n-1);
    }

    public static void main(String args[]){
        fun1(3);
    }
}
