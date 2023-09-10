package Recursion;

public class example_recursion {
    static void printFun(int n){
        if (n==0){
            return;
        }
        else {
            System.out.print(n + " ");
            printFun(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String args[]){
        printFun(3);
    }
}
