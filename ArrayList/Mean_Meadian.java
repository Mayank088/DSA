package ArrayList;
import java.util.*;
public class Mean_Meadian {


    public static int median(int A[],int N)
    {
        Arrays.sort(A);
        int median;

        //If number of elements is even then the median is average of two middle terms.
        if(N%2 == 0)
        {
            median = ( A[N/2] + A[(N/2)-1])/2;
        }

            //If number of elements are odd then the middle term is the median.
        else
        {
            median = A[(N-1)/2];
        }

        //returning the median.
        return median;
    }
    //Function to find mean of the array elements.
    public static int mean(int A[],int N)
    {
        long sum = 0;
        //We iterate over all elements and store the sum of all elements.
        for(int i=0;i<N;i++)
        {
            sum = sum + A[i];
        }
        //Mean is the sum of all elements divided by the number of elements.
        //returning the mean.
        return (int)(sum/N);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9};
        int n = arr.length;
       int ans = mean(arr,n);
        System.out.println( "mean is : " + ans);

       int ans2 = median(arr,n);
        System.out.println("meadian is : " + ans2);
    }
}
