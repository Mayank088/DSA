package ArrayList;
import java.util.*;
import java.io.*;
import java.lang.*;
public class insertElementAt_position {

    static int insert(int arr[], int n, int x, int cap, int pos)
    {
        if(n == cap)
            return n;

        int idx = pos - 1;

        for(int i = n - 1; i >= idx; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return n + 1;
    }

    public static void main(String args[])
    {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        int capacity = 5;
        int N = 3;

        System.out.println("Before Insertion");

        for(int i=0; i < N; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int x = 7;
        int pos = 2;

        N = insert(arr, N, x, capacity, pos);

        //creatin a new array opration doing on it and store in N
        //upar ti return karse navo insert kariyo atle n+1 kari ne navo aavse N

        System.out.println("After Insertion");

        for(int i=0; i < N; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
