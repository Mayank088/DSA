package Bit_magic;
import java.lang.*;

public class powerset_using_bitwise_or_possible_pair {

    void printPowerSet(String s){       //time : O(n * 2^n)
        int n = s.length();
        int powerSet_size = (1<<n);             //find to power we can using Math.pow(2, );
        for (int i=0;i<powerSet_size;i++){
            for (int j=0;j<n;j++){
                if ((i&(1<<j))!=0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println(" ");
        }
    }


    public static void main(String args[]){
        String s = "abc";
        powerset_using_bitwise_or_possible_pair p = new powerset_using_bitwise_or_possible_pair();
        p.printPowerSet(s);
    }
}
