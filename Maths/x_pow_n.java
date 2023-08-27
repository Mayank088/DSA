public class x_pow_n
{
    int pow(int x , int n){    //time compllexity : O(n)
       int res = 1;
       for (int i =0; i<n; i++){
           res = res * x;
       }
        return res;
    }

    //recursive method
    int pow1(int x, int n)
    {                             //time compllexity : O(log(n))
        int temp;
        if (n == 0)
        {
            return 1;
        }
        temp = pow1(x,n/2);
        if (n % 2 == 0)
        {
            return temp * temp;
        }
        else
        {
            return x * temp * temp;
        }
    }


    //iterative power sol. (Binary Expontation) -> best apporch
    int pow2(int x , int n){   //time compllexity : O(log(n))   and aux. space : O(1)
        int res = 1;
        while (n>0){
            if (n%2!=0){
                res = res * x;
            }
            x = x * x;
            n = n/2;
        }
        return res;
    }

    //more optimazation of above sol.

     int pow3(int x, int y)
    {
        // Initialize result
        int res = 1;

        while (y > 0)
        {
            // If y is odd,
            // multiply
            // x with result
            if ((y & 1) == 1)
                res = res * x;

            // y must be even now
            y = y >> 1; // y = y/2         ---shift
            x = x * x; // Change x to x^2
        }
        return res;
    }


    public static void main(String args[]){
        x_pow_n p = new x_pow_n();
        int ans = p.pow(2,0);
        int ans2 = p.pow1(2,4);
        int ans3 = p.pow2(4,5);
        int ans4 = p.pow3(3,5);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}
