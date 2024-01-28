package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Metting_maximum_guest {

    public static int meet_guest(int arr[] , int dep[])
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int guest_count = 1;
        int res = 1;
        int i=1 , j=0;      //i = arrvial   and  j = deparchar
        while (i<arr.length && j < dep.length)
        {
            if (arr[i]<=dep[j])
            {
                guest_count++;
                i++;
            }
            else
            {
                guest_count--;
                j++;
            }
            res = Math.max(res , guest_count);
        }

        return res;
    }


    public static void main(String[] args) {
        int arr[] = {900,600,700};
        int dep[] = {1000,800,730};

        int arr2[] = {900,940,950,1100,1500,1800};
        int dep2[] = {910,1200,1120,1130,1900,2000};

        int ans = meet_guest(arr2,dep2);
        System.out.println(ans);
    }
}
