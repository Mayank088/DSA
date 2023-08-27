public class factorial_digit_count
{
    int count_fact_ans_digit(int n){
        double res1 = 0;

        if(n<0){
            return 0;
        }
        if (n==1 || n==0){
            return 1;
        }

        for (long i =2;i<=n;i++){
            res1 = res1 + Math.log10(i);
        }
        return (int)(Math.log10(res1))+1;
    }
    public static void main(String args[]){
        factorial_digit_count f = new factorial_digit_count();
        int ans = f.count_fact_ans_digit(5);
        System.out.println(ans);
    }

}
