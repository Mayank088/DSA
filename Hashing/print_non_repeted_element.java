package Hashing;
import java.util.*;
//n = 10
//arr[] = {1,1,2,2,3,3,4,5,6,7}
//Output: 4 5 6 7
//Explanation: 4, 5, 6 and 7 are the only
//elements which is having only 1
//frequency and hence, Non-repeating.


//n = 5
//arr[] = {10,20,40,30,10}
//Output: 20 40 30
//Explanation: 20, 40, 30 are the only
//elements which is having only 1
//frequency and hence, Non-repeating


//same as count_non_repeted_element but using arraylist so we can print all array.
public class print_non_repeted_element {
    public static ArrayList<Integer> print_non_repeated(int arr[])
    {
        int n = arr.length;
        ArrayList<Integer> A = new ArrayList<>();
        HashMap<Integer , Integer> H = new HashMap<>();

        for (int i=0 ; i<n ; i++)
        {
            if (H.containsKey(arr[i]))
            {
                H.put(arr[i] , H.get(arr[i])+1);
            }
            else
            {
                H.put(arr[i] , 1);
            }
        }

        for (int i=0 ; i<n ; i++)
        {
            if (H.get(arr[i])==1)
            {
                A.add(arr[i]);
            }
        }
        return A;
    }



    public static void main(String[] args) {
        int arr[] = {10,20,40,30,10};
        ArrayList<Integer> ans = print_non_repeated(arr);
        System.out.println(ans);

    }

}
