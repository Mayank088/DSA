package Searching;

import java.util.Arrays;

public class repeating_element {

    //super naive
    public static int repeating(int arr[])           //time O(n^2)
    {
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++)
        {
            for (int j=i+1 ; j<n ; j++)
            {
                if (arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }


    //naive sol
    public static int repeating2(int arr[])         //time O(n * log n)
    {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=0 ; i<n-1 ; i++)
        {
            if (arr[i]==arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
    }

    //efficient approach
    public static int repeating3(int arr[])      //time O(n) , space O(n)
    {
        int n = arr.length;
        boolean visited[] = new boolean[n];

        for (int i = 0 ; i<n ; i++)
        {
            if (visited[arr[i]])
            {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }


    //efficient approch
    //if 0 is not presenet in array then
    public static int repeating4(int arr[])         //time = O(n) , space = O(1)
    {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

        slow = arr[0];
        while (slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }


    //if 0 is presenet in array then add + 1 in above code in some place
    public static int repeating5(int arr[])         //time = O(n) , space = O(1)
    {
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] +1 ] + 1;
        }while (slow != fast);

        slow = arr[0] + 1;
        while (slow != fast)
        {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }
        return slow;
    }





    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        int ans = repeating(arr);
        System.out.println(ans);

        int ans2 = repeating2(arr);
        System.out.println(ans2);

        int ans3 = repeating3(arr);
        System.out.println(ans3);

        int arr2[] = {1,2,3,4,6,5,7,3};
        int ans4 = repeating4(arr2);
        System.out.println(ans4);
    }
}
