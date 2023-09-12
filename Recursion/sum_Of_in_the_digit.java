package Recursion;

// i/p : 999
// o/p : 9+9+9 = 27
public class sum_Of_in_the_digit {
    //non recursion
    int sum_digit(int n){
        int x;                              //time compllexity = theta(d)
        int y=0;                            //aux space = theta(1)  run faster then recursion
        while (n>0){
            x = n%10;
            y = y + x;
            n = n/10;
        }
        return y;
    }

    //recursion
    int sum_digit2(int n){
        if (n==0){                  //time compllexity = theta(d+1) = theta(d)   here d = input digit
            return 0;               //aux space = theta(d+1) = theta(d)
        }
        return (n%10 + sum_digit(n/10));
    }

    int sum_digit3(int n){
        if (n<=9){           //time compllexity = theta(d)   last sum_digit3(0) call reduce
            return n;        //aux space = theta(d)
        }
        return (n%10 + sum_digit(n/10));
    }

    public static void main(String args[]){
        sum_Of_in_the_digit s = new sum_Of_in_the_digit();
        int ans = s.sum_digit(999);
        System.out.println(ans);

        int ans2 = s.sum_digit2(9999);
        System.out.println(ans2);
    }
}
