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


    public static void main(String args[]){
        x_pow_n p = new x_pow_n();
        int ans = p.pow(2,0);
        int ans2 = p.pow1(2,4);

        System.out.println(ans);
        System.out.println(ans2);
    }
}
