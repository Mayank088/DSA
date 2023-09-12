package Recursion;
//  i/p : 999           //i/p : 99999
//  o/p : 3             // o/p : 5
public class sum_of_the_Total_digit {
    int countDigit(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else {
            return 1 + countDigit(n/10);
        }
    }

    int countDigit2(int n){
        if (n<10){        //it cancle the last 0 recusion call
            return 1;
        }
        return 1 + countDigit2(n/10);
    }

    public static void main(String args[]){
        sum_of_the_Total_digit s = new sum_of_the_Total_digit();
        int ans = s.countDigit(999);
        System.out.println(ans);

        int ans2 = s.countDigit2(00000);   
        System.out.println(ans2);
    }
}
