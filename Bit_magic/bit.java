package Bit_magic;
import java.io.*;

//here is lots of main class hahahahahaha
public class bit {
    public static void main(String args[]){

        class Bitwise_AND{
            public static void main (String[] args) {
                int x = 3, y = 6;
                System.out.println(x & y);
            }
        }


        class Bitwise_OR {
            public static void main (String[] args) {
                int x = 3, y = 6;
                System.out.println(x | y);
            }
        }


        class Bitwise_XOR{
            public static void main (String[] args) {
                int x = 3, y = 6;
                System.out.println(x ^ y);
            }
        }

        class Left_shift {
            public static void main (String[] args) {
                int x = 3;
                System.out.println(x << 1);
                System.out.println(x << 2);
                int y = 4;
                int z = (x << y);
                System.out.println(z);
            }
        }


        class Left_shift_with_negative_num {
            public static void main (String[] args) {
                int x = -1;
                System.out.println(x << 1);
            }
        }


        class Bitwise_NOT {
            public static void main (String[] args) {
                int x = 1;
                System.out.println(~ x);
            }
        }


        class Right_shift {
            public static void main (String[] args) {
                int x = 33;
                System.out.println(x >> 2);
            }
        }

        class Right_shift_with_negative_num{
            public static void main (String[] args) {
                int x = -2;
                System.out.println(x >> 1);
            }
        }

        class Unsignd_Right_shift {
            public static void main (String[] args) {
                int x = -2;
                System.out.println(x >>> 1);
            }
        }
    }

}
