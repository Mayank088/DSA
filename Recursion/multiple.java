package Recursion;

public class multiple {
    int fun(int x , int y){
        if (y==0){
            return 0;
        }
        else {
            return ( x + fun(x,y-1));
        }
    }

    public static void main(String args[]){
        multiple m = new multiple();
        int ans = m.fun(5,5);
        System.out.println(ans);
    }
}
