public class GCD
{
   int gcd1(int a, int b){
        int res = Math.min(a,b);
        while (res>0){
            if (a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }


    //good approch but not best
    int gcd2(int a,int b){
       while (a!=0){
           if (a>b){
               a = a - b;
           }
           else {
               b = b - a;
           }
       }
       return a;
    }

    //best approch

    int gcd3(int a,int b){
       if (b==0){
           return a;
       }
       else {
           return gcd3(b,a%b);
       }
    }


    public static void main(String args[]){
    GCD g1 = new GCD();
    int ans1 = g1.gcd3(10,15);

        System.out.println(ans1);
    }
}
