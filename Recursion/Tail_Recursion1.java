package Recursion;

public class Tail_Recursion1 {
   //Non Tail recursion to print 1 to n
    void fun1(int n) {
        if (n==0){
            return;
        }
        else {
            fun1(n-1);
            System.out.print(n);
        }
    }

    //Convert it to Tail recursion
    void fun2(int n , int k){             //here k is always 1
        if (n==0){
            return;
        }
        else {
            System.out.print(k);
            fun2(n-1 , k+1);
        }
    }

    public static void main(String args[]){
        Tail_Recursion1 t = new Tail_Recursion1();
        t.fun1(5);
        System.out.println(" ");
        t.fun2(5,1);
    }
}
