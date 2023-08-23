public class prime
{
    boolean check_prime1(int n){
        if (n == 1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    boolean check_prime2(int n){
        if (n==1){
            return false;
        }
        for (int i=2; i*i<=n ;i++){
              if (n%i==0){
                  return false;                    //time complexcity = O(sqrt n)
              }
        }
        return true;
    }

    boolean check_prime3(int n){
        if (n==1){              //time complexity : O(sqrt n)  but iteration is 3rd time less to uper sol.
            return false;
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i=5; i*i<=n ;i=i+6){
            if (n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        prime p = new prime();
        boolean ans = p.check_prime3(1031);

        System.out.println(ans);
    }
}
