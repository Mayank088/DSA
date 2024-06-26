package Recursion;

public class example6_recursion {
    public long modfun(long n, long  R)
    {
        // Base cases
        if (n == 0)
            return 0;
        // power zero mean answer is 1
        if (R == 0)
            return 1;
        // If R is even
        long y;
        if (R % 2 == 0) {
            // finding r/2 power as power is even then storing answer in y and if power is even
            // like 2^4 we can simply do (2^2)*(2^2)
            y = modfun(n, R/2);
            y = (y * y) % 1000000007;
        }

        // If R is odd
        else {
            y = n % 1000000007;
            // reduce the power by 1 to make it even. The reducing power by one can be done if we
            // take one n out. Like 2^3 can be written as 2*(2^2)
            y = (y * modfun(n, R - 1) % 1000000007) % 1000000007;
        }
        // finally return the answer (y+mod)%mod = (y%mod+mod%mod)%mod = (y%mod)%mod
        return ((y + 1000000007) % 1000000007);
    }


    long power(int N,int R)
    {
        return modfun(N,R)%1000000007;

    }


    long power2(int N , int R){
        int mod=1000000007;

        if(R==0){
            return 1;
        }

        long ans=power(N,R/2)%mod;
        ans=(ans*ans)%mod;

        if(R%2==1) {
            ans=(ans*N)%mod;
        }

        return ans;
    }

    public static void main(String args[]){
        example6_recursion p = new example6_recursion();

        long ans = p.power(12,21);
        System.out.println(ans);
    }
}
