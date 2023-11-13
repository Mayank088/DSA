package Recursion;

//minimum step to rich 1.(4 aapiyo hoy to 1 karvano che 4 ne tena mate ketla step thase te ans..)
// You are given a number N. You need to convert it to 1 in minimum number of operations.
//The operations allowed are as follows:
//  i) If N is even then divide the number by 2.
//  ii) If N is odd then you can either add 1 to it or subtract 1 from it.

//i/p :
//The first line of input contains T denoting the number of testcases.
//T testcases follow. Each testcase contains 1 line of input containing N.

//o/p = For each testcase, in a new line, print the minimum number of steps required.


import java.util.*;
public class minSteps
{
    public static long minOperations(long n)
    {
        if(n==1)
            return 0; //since 1 is already 1
        if(n==2)
            return 1; //convert 2 to 1. 1 step
        if(n==3)
            return 2; //convert 3 to 2. Then 2 to 1. 2 steps
        long total=0; //save total steps
        if(n%2!=0) //if odd
        {
            total=1+Math.min(minOperations(n-1),minOperations(n+1));
            //convert n to n-1 or n+1 then minimum of those conversions
        }
        else
            total=1+minOperations(n/2); //convert n to n/2 then count operations required for n/2 to 1

        return total; //returning total at the end
    }


    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases-->0)
        {
            long n = sc.nextLong();
            System.out.println(minOperations(n));
        }
    }
}
