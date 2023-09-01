package Bit_magic;

public class maxConsecutiveOnes {
    int max_Consecutive_once1(int N) {

        // Your code here
        int digit;
        int count =0;
        int maxcount =0;
        while(N>0)
        {
            digit= N%2;
            if(digit==1){
                count++;
            }

            else
            {
                maxcount = Math.max(maxcount, count);
                count=0;
            }
            N= N/2;
        }
        maxcount = Math.max(maxcount, count);
        return maxcount;
    }

    int max_Consecutive_once2(int N){
        int count=0;
        int m=0;            //to store max count encountered so far
        if(N == 0) return 0;
        while(N > 0)
        {
            if((N & 1) == 1)
            {
                count++;
                m=Math.max(m,count);
            }
            else
            {
                count=0;
            }
            N=N>>1;
        }
        return m;
    }


    public static void main(String args[]){
        maxConsecutiveOnes m = new maxConsecutiveOnes();

        int ans = m.max_Consecutive_once1(14);
        System.out.println(ans);

        int ans2 = m.max_Consecutive_once2(14);
        System.out.println(ans2);
    }
}
