package Recursion;

public class mcq2 {
    int fun(int x , int y) {
        if (x==0){
            return y;
        }
        else{
            return fun(x-1,x+y);
        }
    }


    public static void main(String args[]){
        mcq2 m = new mcq2();
        int ans = m.fun(4,3);
        System.out.println(ans);
    }
}
