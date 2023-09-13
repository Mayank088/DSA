package Recursion;
//given n meter of length and find maximum peice of cutting rope in set{a,b,c}
//if it is not possible then return -1
public class rope_cutting {
    int maxCuts(int n, int a, int b, int c){      //time complexity = O(3^n)
        if (n==0){
            return 0;
        }
        if (n<0){     //it means n na 3 child n ne -1 return kare
            return -1;
        }

        // aa aakhu ek j line ma che 3 alag nathi result vadu
        int result = Math.max( maxCuts(n-a,a,b,c),
                     Math.max( maxCuts(n-b,a,b,c),
                     maxCuts(n-c,a,b,c) ) );

        if (result == -1){
            return -1;
        }
        else {
            return result + 1;
        }
    }

    public static void main(String[] args) {
        rope_cutting r = new rope_cutting();
        int ans = r.maxCuts(23 , 11,9,12);
        System.out.println(ans);     //ans = 2
    }
}
