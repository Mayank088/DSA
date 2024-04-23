package Hashing;

import java.util.HashSet;


//ans of intersetion is accroding to a1 array
public class intersetion_of_two_unsorted_array
{
    public static void intersetion(int a[] , int b[])
    {
        int n = a.length;
        int m = b.length;

        HashSet<Integer> h = new HashSet<>();


        for (int i=0 ; i<m ; i++)
        {
            h.add(b[i]);
        }


        for (int i=0 ; i<n ; i++)
        {
            if (h.contains(a[i]))
            {
                System.out.print(a[i] + " ");
            }
        }
    }



    public static void main(String[] args)
    {
        int a[] = {89, 24, 75, 11, 23};
        int b[] = {75 , 89, 2, 24};

        intersetion(a,b);
        //ans is 89 , 75, 24
        //beacuse 89 is in a[] array is first appear then 24 is appear and then 75.
    }
}
