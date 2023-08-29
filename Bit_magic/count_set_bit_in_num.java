package Bit_magic;
import java.io.*;
public class count_set_bit_in_num
{
    static int []table = new int[256];    //globle declear kariyo
    int count_set_bit1(int n){
        int res=0;
        while (n>0){
            if (n%2==1){
                res++;
            }
            n = n/2;
        }
        return res;
    }

    int count_set_bit2(int n){
        int res = 0;
        while (n>0){
            if ((n&1)!=0){                     // & is faster then modulo (%)
                res++;
            }
            n=n/2;
        }
        return res;
    }

    int count_set_bit3(int n){
        int res = 0;
        while (n>0){
            n = n & (n-1);
            res++;
        }
        return res;
    }





    // recursive function to count set bits
    static void initialize() {
            //   static int []table = new int[256];    upar decler kariyo cho globle ma
        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++)
        {
            table[i] = table[i & (i-1)] + 1;
        }
    }
    public static int count_set_bit4(int n)
    {
        return table[n & 255] + table[(n >> 8) & 255] + table[(n >> 16) & 255] + table[n >> 24];
    }
    //ama ans khoto aave che aana pachi nu navi file che lookup_table vado tema sachu che o/p


    public static void main(String args[]){
        count_set_bit_in_num c = new count_set_bit_in_num();
        int ans1 = c.count_set_bit1( 5);
        System.out.println("ans1 :" + ans1);

        int ans2 = c.count_set_bit2( 7);
        System.out.println("ans2 :" + ans2);

        int ans3 = c.count_set_bit3(40);
        System.out.println("ans3 :" + ans3);

        int ans4 = c.count_set_bit4(40);
        System.out.println("ans4 :" + ans4);
    }
}
