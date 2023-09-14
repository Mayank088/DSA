package Recursion;
// i/p : "ABC"
// o/p : "" "A" "B" "C" "AB" "BC" "AC" "ABC"
public class subset {

    void subset_or_powerset_or_subSequence(String s , String current , int i){
        int n = s.length();
        if (i == n){
            System.out.println(current);      // base case
            return;
        }

        subset_or_powerset_or_subSequence(s , current , i+1);    //We do not consider current character as part of current
        subset_or_powerset_or_subSequence(s , current + s.charAt(i) , i+1); //We consider the characteras part of current subset

    }


    public static void main(String[] args) {
        subset s = new subset();
        String st = "ABC";
        String curr = "";
        int i = 0;
        s.subset_or_powerset_or_subSequence(st,curr,i);
        //s.subset_or_powerset_or_subSequence("ABC" , "" , 0);
    }
}
