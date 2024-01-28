package sorting;
import java.util.*;

//aa same question che aani pela no hato te meeting maximum guest vado che te j che same fervnine puchiyo che

//Given arrival and departure times of all trains that reach a railway station. Find the minimum number
// of platforms required for the railway station so that no train is kept waiting.
//Consider that all the trains arrive on the same day and leave on the same day.
// Arrival and departure time can never be the same for a train but we can have arrival time of one train
// equal to departure time of the other. At any given instance of time, same platform can not be used for
// both departure of a train and arrival of another train. In such cases, we need different platforms.


//Example 1:
//Input: n = 6
//arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//Output: 3
//Explanation:
//Minimum 3 platforms are required to
//safely arrive and depart all trains.
//Example 2:
//
//Input: n = 3
//arr[] = {0900, 1100, 1235}
//dep[] = {1000, 1200, 1240}
//Output: 1
//Explanation: Only 1 platform is required to
//safely manage the arrival and departure
//of all trains.
public class minimum_platforms {
    static int findPlatform(int arr[], int dep[])
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int train_count = 1;
        int res = 1;
        int i=1 , j=0;      //i = arrvial   and  j = deparchar
        while (i<arr.length && j < dep.length)
        {
            if (arr[i]<=dep[j])
            {
                train_count++;
                i++;
            }
            else
            {
                train_count--;
                j++;
            }
            res = Math.max(res , train_count);
        }
        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int ans = findPlatform(arr,dep);
        System.out.println(ans);
    }
}
