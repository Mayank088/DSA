public class trailing_zero
{
    int countzero(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        int res = 0;
        while (fact%10==0){
            res++;
            fact = fact/10;
        }
        return res;
    }

    //time complexity is (n)

    //or best approch is below

    int Count_Zero(int x){
        int res = 0;
        for (int i = 5 ; i <= x ; i = i*5){
            res = res + (x/i);
        }
        return res;
    }
    //time complexity is (logn)

    public static void main(String args[]){
        trailing_zero z = new trailing_zero();
        int ans = z.Count_Zero(345);

        System.out.println(ans);
    }

}
