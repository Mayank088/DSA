// Java program for the above approach
import java.lang.*;
import java.util.*;

class possible_pair{

    // Function to print all possible pairs
    static void print(int a[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (i != j)
                    System.out.println(a[i] + " " + a[j]);
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        // Given array
        int a[] = { 1, 2, 3 };

        // Store the size of the array
        int n = a.length;

        // Function Call
        print(a, n);
    }
}