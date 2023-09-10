package Recursion;
//it return 1 when n is power of 3.
//otherwise it return 0
public class mcq4 {
    int fun(int n){
        if (n==0 || n==1){
            return n;
        }
        else if ((n%3)!=0){
            return 0;
        }
        else {
            return fun(n/3);
        }
    }

    public static void main(String args[]){
        mcq4 m = new mcq4();
        int ans = m.fun(27);
        System.out.println(ans);

        int ans2 = m.fun(26);
        System.out.println(ans2);
    }
}
