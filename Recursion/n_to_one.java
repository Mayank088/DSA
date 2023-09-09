package Recursion;

public class n_to_one {
    void print_N_to_one(int n){
        if(n==0){
            return;
        }
        else {
            System.out.print(n + " ");
            print_N_to_one(n-1);
        }
    }

    public static void main(String args[]){
        n_to_one n = new n_to_one();
        n.print_N_to_one(4);
    }

}
