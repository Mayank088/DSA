package ArrayList;

public class Frequencies_in_sorted_array
{
    public static void feq(int arr[])
    {
        int n = arr.length;
        int i=1;
        int freq=1;

        while (i<n)                    //Time Complexity: O(N)  ,  Auxiliary Space: O(1)
        {
            while (i<n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " Frequencies is : " + freq);
            freq = 1;
            i++;
        }


        if (n==1  || arr[n-1] != arr[n-2])           //it is use for last element checking because last element ia not going to inside while loop here , n-1 means last element and n-2 is second last element.
        {
            System.out.println(arr[n-1] + " Frequencies is : " + 1);
        }
    }



    public static void main(String[] args)
    {
     int arr[] = {10,10,10,34,45,45,6};
     feq(arr);
    }
}
