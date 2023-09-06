package Recursion;

public class example2_recursion
{
    static int fun(int n){
        if (n==4){
            return n;
        }
        else {
            return 2 * fun(n+1);
        }
    }


    public static void main(String args[]){
        System.out.println(fun(2));
    }
}

//  o/p : 16