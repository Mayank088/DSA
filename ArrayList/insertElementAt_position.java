package ArrayList;
import java.util.*;
import java.io.*;
import java.lang.*;
public class insertElementAt_position {
    int insert(int arr[] , int n , int x , int pos , int cap){
        if (n == cap){
            return n;
        }
        int index = pos - 1;
        for(int i = n - 1; i >= index; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[index] = x;

        return n + 1;
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        int n = 3;
        int capacity = 5;

        System.out.println("Before Insertion");
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int x = 7;
        int position = 2;         //index staring form 1 in output array assume that..

        insertElementAt_position i = new insertElementAt_position();
        i.insert(arr , n, x, position ,capacity);

        System.out.println("After Insertion");

        for(int j=0; j < arr.length; j++)
        {
            System.out.print(arr[j]+" ");
        }


    }
}
