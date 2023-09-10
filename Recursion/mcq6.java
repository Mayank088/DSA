package Recursion;
//when r = 10 then n je kai pan hoy tema jetla number hoy teno sum thay
// atle n = 456 hoy to 4+5+6 = 15 aavo ans aave

//but when r = 2 then it return sum of set bit in the n
//atle n = 7 hoy to tenu binary 111 thay to tema jetla set bit hoy teno sum thay 1+1+1 = 3 ans aavo ave
public class mcq6 {
    int fun(int n , int r){
        if (n>0){
            return (n%r + fun(n/r , r));
        }
        else {
            return 0;
        }
    }

    public static void main(String args[]){
        mcq6 m = new mcq6();

        int ans = m.fun(456 , 10);
        System.out.println(ans);

        int ans2 = m.fun(7 , 2);
        System.out.println(ans2);
    }
}
