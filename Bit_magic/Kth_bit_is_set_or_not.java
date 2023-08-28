package Bit_magic;

public class Kth_bit_is_set_or_not {

    void is_set1(int n , int k){     //time complexcity : O(k)
        int x = 1;
        for (int i=0;i<(k-1);i++){
            x = x*2;
        }
        if ((n&x)!=0){                            // n & x
            System.out.println("kth bit is set (1)");
        }
        else {
            System.out.println("no");
        }
    }

    void is_set2(int n , int k){     //time complexcity : O(k)
        int x = 1;
        for (int i=0;i<(k-1);i++){
            n = n/2;
        }
        if ((n&1)!=0){                             // n & 1
            System.out.println("kth bit is set (1)");
        }
        else {
            System.out.println("no");
        }
    }

    void is_set3(int n , int k){
        int x = (1<<(k-1));      // k = 3 --> k-1 = 2 so x = (1<<2) and x is now 4 beacuse 1 shifted 2
                                //so left shift formula is x * 2^y formula is applay and ans is 4
        if ((n&x)!=0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    void is_set4(int n , int k){
        int x = (n>>(k-1));     // x = 5 >> 2 right shift formula is x/2^y = 5 / 2^2 = 5/4 = 1
                                    // so x = 1
        if ((x&1)!=0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }


    boolean is_set5(int n , int k){      //idk ans is wrong but gfg is allow only this to pass all testcase
        return (n&(1<<k))!=0;             // linear sol. best approch
    }




    public static void main(String args[]){
        int n = 5;
        int k = 3;
        Kth_bit_is_set_or_not a = new Kth_bit_is_set_or_not();
        a.is_set4(n,k);


    }
}
