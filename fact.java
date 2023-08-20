public class fact
{
    int factorial(int n){
        int rev= 1;
        for (int i = 2; i<=n ; i++){
            rev = rev * i;
        }
        return rev;

    }
    public static void main(String args[]){
        fact f = new fact();
        int a = f.factorial(5);
        System.out.println(a);
    }

}
