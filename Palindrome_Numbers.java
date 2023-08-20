public class Palindrome_Numbers
{
    boolean num(int n){
        int temp = n;
        int reverse = 0;
        while (temp!=0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }
        return (reverse==n);
    }

    public static void main(String args[]){
        Palindrome_Numbers p = new Palindrome_Numbers();
        boolean ans = p.num(12321);
        System.out.println(ans);
    }
}
