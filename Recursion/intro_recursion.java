package Recursion;

public class intro_recursion {
    static void fun1(){
        System.out.println("fun1");
        // fun1();   stack overflow
    }

    static void fun2(){
        System.out.println("Starting fun2 - before call fun1");
        fun1();
        System.out.println("Ending fun2 - after call fun1");
    }



    public static void main(String args[]){
        System.out.println("starting main");
        fun2();
    }
}
