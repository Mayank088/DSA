package Recursion;

public class example5_recursion {
    static void fun(int n)
    {
        if (n==0){
            return;
        }
        else {
            fun(n/2);
            System.out.print(n % 2);
        }

    }
    public static void main(String args[])
    {
        fun(7);
        System.out.println(" ");
        fun(13);

    }
}
