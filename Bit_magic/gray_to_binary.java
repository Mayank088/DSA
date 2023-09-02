package Bit_magic;

public class gray_to_binary {
    int g_to_b(int n){
        int result = n;
        while (n>0){
            n = n >> 1;
            result = result ^ n;
        }
        return result;
    }

    public static void main(String args[]){
        gray_to_binary b = new gray_to_binary();
        int ans = b.g_to_b(15);
        System.out.println(ans);
    }
}
