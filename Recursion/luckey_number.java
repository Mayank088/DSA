package Recursion;
//Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of
// arriving at lucky numbers,

//        Take the set of integers
//        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……

//        First, delete every second number, we get following reduced set.
//        1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………

//        Now, delete every third number, we get
//        1, 3, 7, 9, 13, 15, 19,….….

//        Continue this process indefinitely……
//        Any number that does NOT get deleted due to above process is called “lucky”.

//        You are given a number N, you need to tell whether the number is lucky or not.
//        If the number is lucky return 1 otherwise 0.
public class luckey_number {

    boolean luckey(int n){
        for (int i=2 ; i<=n ; i++)
        {
            if (n%i==0){
                return false;     // Deleting every i-th position number
            }
            n = n - (n/i);  //new position of n , like in first iteration every 2nd number deleted ,
                            // so previous position of  13 is 13 , and the new position will be 13 - 13/2 = 7
        }
        return true;
    }

     boolean check(int n,int counter)
    {
        if(counter<=n){
            if(n%counter==0){
                return false;
            }
            // calculate next position of input number
            n = n - (n/counter);
            counter++;
            // make recursive call with updated counter
            // and position return check(n, counter);
            return check(n, counter);
        }
        else{
            return true;
        }
    }




    public static void main(String[] args) {
        luckey_number l = new luckey_number();
        boolean ans = l.luckey(19);
        System.out.println(ans);

        boolean ans2  = l.luckey(5);
        System.out.println(ans2);

        boolean ans3 = l.check(19,2);
        System.out.println(ans3);
    }
}
