public class fact
{
    int factorial(int n){
        int rev= 1;
        for (int i = 2; i<=n ; i++){
            rev = rev * i;
        }
        return rev;

    }

    int factorial_1(int n){
        if (n==0){
            return 1;
        }
        else {
            return n * factorial_1(n-1);
        }
    }
    public static void main(String args[]){
        fact f = new fact();
        int a = f.factorial_1(5);
        System.out.println(a);
    }

}
