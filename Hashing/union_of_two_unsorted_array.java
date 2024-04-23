package Hashing;
// i/p
// int a[] = {15,20,5,15};
// int b[] = {15,15,15,20,10};

//o/p
// 15 , 20, 10, 5  ==> so total 4 is unique number in two array so output is 4
import java.util.HashSet;

public class union_of_two_unsorted_array {

    public static int union(int a[] , int b[])
    {
        HashSet<Integer> h = new HashSet<>();

        for (int i=0 ; i<a.length; i++)
        {
            h.add(a[i]);
        }

        for (int i=0 ; i<b.length ; i++)
        {
            h.add(b[i]);
        }

        return h.size();
    }



    public static void main(String[] args) {
        int a[] = {15,20,5,15};
        int b[] = {15,15,15,20,10};
        int ans = union(a,b);
        System.out.println(ans);
    }
}
