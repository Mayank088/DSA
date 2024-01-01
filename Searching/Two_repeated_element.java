package Searching;
//You are given an array of N+2 integer elements.
// All elements of the array are in the range 1 to N.
// Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.

//Input:
//N = 4
//array[] = {1,2,1,3,4,3}
//Output: 1 3
//Explanation: In the given array,
//1 and 3 are repeated two times.


//Input:
//N = 2
//array[] = {1,2,2,1}
//Output: 2 1
//Explanation: In the given array,
//1 and 2 are repeated two times
//and second occurence of 2 comes
//before 1. So the output is 2 1.
public class Two_repeated_element {

    public static int[] repeated(int[] arr, int N)    //time = O(n) , space O(1)
    {
        boolean visited[] = new boolean[N+2];
        int result[] = new int[2];
        int index = 0;

        for (int i = 0 ; i<arr.length ; i++) {
            if (visited[arr[i]] == true)
            {
                result[index] = arr[i];
                index++;
            }

            visited[arr[i]] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,3};
        int N = 4;

        int ans[] = repeated(arr,N);
        for (int i=0 ; i<2 ; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
