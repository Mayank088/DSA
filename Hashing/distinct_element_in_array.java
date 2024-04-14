package Hashing;


//i/p : arr[] = {15,12,13,12,13,13,18}
//o/p : 4    (in this array 15,12,13,18 are distinct(unique element in array) )


import java.util.HashSet;

//i/p : arr[] = {10,10,10}
//o/p : 1
public class distinct_element_in_array {

    public static int count_distinct(int arr[])
    {
        int n = arr.length;

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i=0 ; i < n ; i++)
        {
            h.add(arr[i]);
        }
        return h.size();
    }


    //naive
    public static int count_distinct2(int arr[])      //time O(n^2)
    {
        int n=arr.length;
        int res=0;
        for (int i=0 ; i<n ; i++)
        {
            boolean falg = false;

            for (int j=0 ; j<i ; j++)
            {
                if (arr[i]==arr[j])
                {
                    falg = true;
                    break;
                }
            }
            if (falg==false)
            {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {15,12,13,12,13,13,18};
        int ans = count_distinct(arr);
        System.out.println(ans);

        int ans2 = count_distinct2(arr);
        System.out.println(ans2);
    }
}
