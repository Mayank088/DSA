public class all_divisor_of_number
{
    void divisor(int n){           //time complexity : O(n)
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    void divisor2(int n){                   //time complexity : O(sqrt(n))
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                if (i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }

    void divisor3(int n) {        //time complexity : O(sqrt(n)) + O(sqrt(n))
    int i;                        //                  = O(sqrt(n))
        for (i=1; i*i<=n ; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
        for ( ; i>=1; i--){
            if (n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String args[]){
        all_divisor_of_number d = new all_divisor_of_number();
        d.divisor3(30);
    }
}
