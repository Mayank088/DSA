import java.util.Scanner;

class count {
    int count_digit(int x) {
        int result = 0;
        while (x>0){
            x = x/10;
            result++;
        }
         return result;
    }
}


public class counting_number
{
    public static void main(String args[]){

        count c = new count();
        int k = c.count_digit(456);
        System.out.println(k);
        }

}


