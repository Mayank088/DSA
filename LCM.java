public class LCM {

    //time complexity : O(a*b - max(a,b))
    int ans_lcm(int a , int b){
        int res = Math.max(a,b);
        while (true){
            if (res%a==0 && res%b==0) {
                return res;
            }
            res++;
        }
    }

        int gcd_to_lcm(int a,int b){
            if (b==0){
                return a;
            }
            else {
                return gcd_to_lcm(b,a%b);
            }
        }

        int gcd_to_lcm_ans(int a,int b)
        {
        return (a*b)/gcd_to_lcm(a,b);
        }

        //time complexity : O(log(min(a,b))


    public static void main(String args[]){
        LCM l = new LCM();
        int ans = l.gcd_to_lcm_ans(4,6);
        System.out.println(ans);
    }
}
