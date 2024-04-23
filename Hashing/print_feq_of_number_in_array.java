package Hashing;
//i/p : arr[] = {10,12,10,15,10,20,12,12}
//o/p : 10    3
//      12    3
//      15    1
//      20    1

//o/p can be any order

import java.util.HashMap;
import java.util.Map;

public class print_feq_of_number_in_array {

    public static void printFeq(int arr[])            //time = O(n^2) , space = O(1)
    {
        for (int i=0 ; i <arr.length ; i++)
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

            if (falg==true)
            {
                continue;
            }

            int feq = 1;
            for (int j = i+1 ; j<arr.length ; j++)
            {
                if (arr[i]==arr[j])
                {
                    feq++;
                }
                System.out.println(arr[i] + " " + feq);
            }
        }
    }


    public static void print(int arr[])             //time = O(n) , space = O(n)
    {
        int count=0;
        HashMap<Integer , Integer> h = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++)
        {
            if (h.containsKey(arr[i])==true)
            {
                h.put(arr[i] , h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i] , 1);
            }
        }

      for (Map.Entry<Integer,Integer> m : h.entrySet())
      {
          System.out.println(m.getKey() + " " + m.getValue());
      }
    }



    public static void main(String[] args) {
        int arr[] = {10,12,10,15,10,20,12,12};
        print(arr);
    }
}
