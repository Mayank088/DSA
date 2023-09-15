package Recursion;


//n = 99999
//Output: 9
// Explanation: Sum of digits of 99999 is 45 which is not a single digit number, hence
// sum of digit of 45 is 9 which is a single digit number.
public class digital_root {

    int digitalRoot(int n)
    {
        if(n/10 == 0 || n==0){
            return n;
        }

        int temp  =  n%10 + digitalRoot(n/10);

        return digitalRoot(temp);
    }


    //my solutation may be wrong for some gfg case but it still work..
    //not a recursion sol..
    int digitalRoot2(int n)
    {
        int x = 0;
        int y = 0;
        int mod;
        if(n<0){
            return 0;
        }
        while(n>0){
            mod = n % 10;
            x = x + mod;
            n = n/10;
        }
        
        if(x<0){
            return 0;
        }
        while(x>0){
            mod = x % 10;
            y = y + mod;
            x = x/10;
        }
        return y;
    }


    public static void main(String[] args) {
        digital_root d = new digital_root();
        int ans = d.digitalRoot(11115555);
        System.out.println(ans);
        int ans2 = d.digitalRoot(99999);
        System.out.println(ans2);


        int ans3 = d.digitalRoot2(11115555);
        System.out.println(ans3);
        int ans4 = d.digitalRoot2(99999);
        System.out.println(ans4);

    }
}
