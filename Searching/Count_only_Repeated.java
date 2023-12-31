package Searching;
//Given an array arr[] of N positive integers, where elements are consecutive (sorted).
// Also, there is a single element which is repeating X (any variable) number of times.
// Now, the task is to find the element which is repeated and number of times it is repeated.
//Note: If there's no repeating element, Return {-1,-1}.

//N = 5
//arr[] = {1,2,3,3,4}
//Output: 3 2
//Explanation: In the given array, 3 is occuring two times

//arr[] = {6,7,8,8,9,10}
public class Count_only_Repeated {

    public static void repeated(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<=end)
        {
            int mid = (start+end)/2;

            if (arr[0]+mid <= arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        int freq = n - (arr[n-1] - arr[0]);
        System.out.println("repeated element is : " + arr[start] +" and " + freq + " is the freq of repeat.");
    }

    public static void main(String[] args) {
        int arr[] = {6,7,8,8,9,10};
        repeated(arr);
    }
}
