package ArrayList;
//Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively
// i.e first element should be max value, second should be min value, third should be second max,
// fourth should be second min and so on.

//Note: Modify the original array itself. Do it without using any extra space.
// You do not have to return anything.

//n = 6
//arr[] = {1,2,3,4,5,6}

//Output: 6 1 5 2 4 3

//Explanation: Max element = 6, min = 1,
//second max = 5, second min = 2, and
//so on... Modified array is : 6 1 5 2 4 3.
public class Rearrange_Array_Alternately
{
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){

        // Your code here
        // science array is sorted so maxindex is from back side and from front its minIndex
        int maxInd = n-1;           //time = O(n)  , aux = O(1)
        int minInd = 0;

        //map that will help to store new and old both values in one place
        long map = arr[n-1]+1;

        //dividend = quotient × divisor + remainder
        //here we have to make a formula
        // such that :-
        // quotient becomes newValue
        // divisor is map here
        // and remainders become old value

        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                arr[i] = (arr[maxInd] % map) * map+arr[i];
                maxInd--;
            }
            else{
                arr[i] = (arr[minInd] % map) * map+arr[i];
                minInd++;
            }
        }

        //if we divide arr[i] with map it will become alternately arranged and if you modulo (%) it with map it will return original array
        for(int i = 0 ; i < n; i++) {
            arr[i] = arr[i]/map;
        }
    }

    public static void main(String[] args)
    {
        long arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        rearrange(arr,n);

//for printing the ans...
        for (int i =0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
