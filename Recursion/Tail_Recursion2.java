package Recursion;

public class Tail_Recursion2 {
    //Non Tail recursion to find factorical of n
    int fact1(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * fact1(n-1);
        }
    }

    //convert it to tail recrsion
    int fact2(int n , int k){             //k = 1 always
        if (n==0 || n==1){
            return k;
        }
        else {
            return fact2(n-1 , k * n);
        }
    }


    public static void main(String args[]){
        Tail_Recursion2 t = new Tail_Recursion2();
        int ans = t.fact1(5);
        System.out.println(ans);

        int ans2 = t.fact2(5,1);
        System.out.println(ans2);
    }
}
