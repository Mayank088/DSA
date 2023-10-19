package ArrayList;
//Given a number n the task is to find the minimum number which is divisible by all numbers from 1 to n
//Input:
//n = 3
//Output:
//6
//        Explanation:
//        When n = 3 then the minimum number
//        that is divisible by all the number
//        till 3 is 6

public class numgame
{
    public static int NumGame(int n)
    {
        int res = 1;
        for (int i=2 ; i<=n ; i++)
        {
            res = lcm(i , res);
        }
        return res;
    }
    public static int lcm(int x , int y)
    {
        return ((x*y)/gcd(x,y));
    }

    public static int gcd(int x , int y)
    {
        if(y == 0)
        {
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args)
    {
        int n = 3;
        int ans = NumGame(n);
        System.out.println(ans);
    }
}
