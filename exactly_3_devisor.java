public class exactly_3_devisor
{
    // method to check if N is prime
    boolean check_prime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2 ; i<=Math.sqrt(n) ; i++){        // i<=Math.sqrt(n) is same as i*i<=n
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    // method to check the numbers which has exactly 3 divisors
    public int exactly3Divisors(int N)
    {
        //Initializing counter to zero
        int counter=0;
        N = (int)Math.sqrt(N);

        //Running a loop from 1 to sqrt(N)
        for(int i=1;i<=N;i++)
        {
            //note imp : A number N only has 3 divisors if it is a
            //           perfect square and its square  root is a prime number,
            //           and we know the number of perfect squares less than N which
            //           is sqrt(N), so just checking if i is prime or not
            if(check_prime(i)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String args[]){
        exactly_3_devisor e = new exactly_3_devisor();
        int ans = e.exactly3Divisors(10);

        System.out.println(ans);

        //atle 10 ke teni niche eva ketla number che ke jene exactly 3 Divisors che
        //ahi 9 and 4 eva che atle 2 number eva aaviya 10 ni niche ke jene 3 divisor che atle ans 2
    }
}
