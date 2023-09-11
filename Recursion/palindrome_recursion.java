package Recursion;

public class palindrome_recursion {

    //non recursion
    boolean isPalindrome1(int n){
        int temp = n;
        int reverse = 0;
        while (temp!=0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }
        return (reverse==n);
    }

    //recursion
    boolean isPalindrome(String str , int start , int end){
        if (start >= end){
            return true;
        }
        else{
            return ((str.charAt(start)==str.charAt(end)) && isPalindrome(str , start+1 , end-1));
        }
    }


    //recursion
    boolean isPalindrome2(String s, int i){
        if(i > s.length()/2)
        {
            return true ;
        }
        else {
            return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome2(s, i+1) ;
        }
    }

    public static void main(String args[]){
        palindrome_recursion p = new palindrome_recursion();
        String s = "abbcbba";
        boolean ans = p.isPalindrome(s , 0 , (s.length()-1) );
        System.out.println(ans);
    }
}



//second approch

// A recursive JAVA program to
// check whether a given String
// is palindrome or not
class GFG
{
    // A recursive function that
    // check a str(s..e) is
    // palindrome or not.
    static boolean isPalRec(String str, int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;

        // If first and last
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str)
    {
        int n = str.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    // Driver Code
    public static void main(String args[])
    {
        String str = "geeg";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}