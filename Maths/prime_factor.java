public class prime_factor
{
    static void Check_prime_factor(int n){
        if (n<=1){
            return;
        }
        for (int i=2 ; i*i<=n ; i++){
            while (n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if (n>1){
            System.out.println(n);
        }
        System.out.println();
    }

    static void Check_prime_factor2(int n) {
        if(n <= 1) {
            return;
        }
        while(n % 2 == 0) {
            System.out.print(2+" ");
            n = n / 2;
        }
        while(n % 3 == 0) {
            System.out.print(3+" ");
            n = n / 3;
        }
        for(int i=5; i*i<=n; i=i+6)
        {
            while(n % i == 0)
            {
                System.out.print(i+" ");
                n = n / i;
            }
            while(n % (i + 2) == 0)
            {
                System.out.print((i + 2)+" ");
                n = n / (i + 2);
            }
        }
        if(n > 3)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int p = 450;
        Check_prime_factor2(p);
    }
}
