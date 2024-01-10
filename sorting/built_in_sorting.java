package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;


//Arrays.sort() vs Collections.sort()
//=> Arrays.sort works for arrays which can be of primitive data type also. Collections.sort() works for
// objects Collections like ArrayList, LinkedList, etc.

//=> Arrays.sort can be used in two cases i.e., to sort the whole array or sort a subarray
// and along with this it provides multiple declarations for different primitive data types
// but Collections.sort can be used in two cases i.e., using a comparator and not using a comparator
// for all data types.


public class built_in_sorting {
    public static void main(String[] args)
    {
        int arr[] = {5,20,10,12,9,30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));     //Arrays.tosting ti encode karelu aave baki alag j rite aavtu tu
        //[5, 9, 10, 12, 20, 30]

        char arr2[] = {'b','a','g','c'};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //[a, b, c, g]

        int arr3[] = {5,30,20,40,10,33,12};
        Arrays.sort(arr3,2,5);        //if we wnat to sort only index 3 to 5 then it is use
        System.out.println(Arrays.toString(arr3));
        //[5, 30, 10, 20, 40, 33, 12]


        //wrapper class example
        Integer arr4[] = {5,20,10,12,9,30};            //if we want to decending order then we need
        Arrays.sort(arr4, Collections.reverseOrder());      //to chage int to Integer then
        System.out.println(Arrays.toString(arr4));       // call Collections.reverseOrder()
        //[30, 20, 12, 10, 9, 5]


        //collections.sort()

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(5);
        list.add(10);

        Collections.sort(list);          //asending order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());      //decending order
        System.out.println(list);

    }
}
