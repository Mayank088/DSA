public class print_prime_number
{
    boolean is_prime(int n){
        if (n==1){
            return false;
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i=5 ; i*i<=n ; i++){
            if (n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    void print_prime(int n){         //time complexcity : O(n * sqrt(n))
        for (int i=2 ; i<=n ; i++){
            if (is_prime(i)){
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String args[]){
        print_prime_number p = new print_prime_number();
        p.print_prime(30);
    }
}
