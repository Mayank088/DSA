package Bit_magic;

public class swap_evenBit_to_oddBit {
    int swapBits(int N)
    {
        // Get all even set bits of x
         int even_bits = N & 0xAAAAAAAA;             //0xAAAAAAAA means 10101010101010....

        // Get all odd set bits of x
         int odd_bits = N & 0x55555555;            // 0x55555555 means 0101010101010101....

        // Right shift even bits
        even_bits =  even_bits >> 1;

        // Left shift odd bits
        odd_bits = odd_bits << 1;

        // Combine even and odd bits
        return (even_bits | odd_bits);


//        Each bit in even_bits and odd_bits is compared, and if at least one of the bits is set to 1,
//         the corresponding bit in the result will also be set to 1.

//         If both bits are 0, the result bit will be 0.
//         -> For example, if even_bits contains 1010 (in binary) and odd_bits contains 1101 (in binary),
//         the expression even_bits | odd_bits would result in 1111 (in binary).
//         -> This operation is commonly used for combining or setting specific bits in integer values
//         when you want to create a new integer that has certain bits turned on based on the values of other integers.
    }


     int swapBits2(int n)
    {
        return ( ( (n & 0xAAAAAAAA) >> 1) | ( (n & 0x55555555) << 1) );
    }

    public static void main(String args[]){
        swap_evenBit_to_oddBit s = new swap_evenBit_to_oddBit();

        int ans = s.swapBits(23);
        System.out.println(ans);

        int ans2 = s.swapBits2(23);
        System.out.println(ans2);
    }
}
