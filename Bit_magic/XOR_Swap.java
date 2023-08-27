package Bit_magic;
import java.io.*;
public class XOR_Swap {


        public static void main(String[] args)
        {
            int x = 5, y = 10;
            // binary equivalent of 5 is 0101
            // binary equivalent of 10 is 1010

            // binary equivalent of x  will become 1111 ie x=15
            x = x ^ y;
            // binary equivalent of y  will become 0101 ie y=5
            y = x ^ y;
            // binary equivalent of x  will become 1010 ie x=10
            x = x ^ y;
            System.out.println("The value of x is " + x
                    + " and the value of y is " + y);
        }
}
