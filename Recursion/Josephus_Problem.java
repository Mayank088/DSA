package Recursion;

public class Josephus_Problem {

    //position is starting form 0
    int jos(int n,int k){            //time compllexity = T(n) = T(n-1) + c => theta(n)
        if (n==1){
            return 0;
        }
        return (jos(n-1,k) + k) % n;
    }

    //if position is staring form 1 then
    int jos2(int n,int k){
        if (n==1){
            return 0;
        }
        return (jos2(n-1,k) + k) % n;
    }
    int my_jos2(int n , int k ){
        return jos2(n,k) + 1;
    }

    public static void main(String[] args) {
        Josephus_Problem j = new Josephus_Problem();
        int ans = j.jos(5,3);
        System.out.println(ans);

        int ans2 = j.my_jos2(5,3);
        System.out.println(ans2);
    }
}
