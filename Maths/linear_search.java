// Java program for the above approach
import java.lang.*;
import java.util.*;

class linear_serach{

    // Function to find whether a key exists in an
    // array or not using linear search
    static boolean linearSearch(int a[], int n, int key)
    {

        // Traverse the given array, a[]
        for(int i = 0; i < n; i++)
        {

            // Check if a[i] is equal to key
            if (a[i] == key)
                return true;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Given Input
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int n = arr.length;

        // Function Call
        if (linearSearch(arr, n, x))
            System.out.println("Element is present in array");
        else
            System.out.println("Element is not present in array");
    }
}