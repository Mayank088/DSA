package Recursion;

//print 1 to n
public class one_to_n {

    void print_one_to_n1(int n){
        if(n==0){
            return;
        }
        else {
            print_one_to_n1(n-1);
            System.out.print(n + " ");
        }
    }

    void print_one_to_n2(int initail_digit , int last_digit){
        if (initail_digit <= last_digit){
            System.out.print(initail_digit);
            print_one_to_n2(initail_digit + 1 , last_digit);
        }
    }


    public static void main(String args[]){
        one_to_n n = new one_to_n();
        n.print_one_to_n1(4);

        System.out.println(" ");

        n.print_one_to_n2(1,4);
    }

}
