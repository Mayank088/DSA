package ArrayList;

import java.util.ArrayList;

public class Max_and_SecondMax {
    public static ArrayList<Integer> large_and_SecondLarge(int arr[])
    {
        int n = arr.length;
        int large = 0;
        int secondLarge = -1;

        for (int i=1 ; i<n ; i++)
        {
            if (arr[i] > arr[large])
            {
                secondLarge = large;
                large = i;
            }

            else if (arr[i] != arr[large])
            {
                if (secondLarge == -1 || arr[i] > arr[secondLarge])
                {
                    secondLarge = i;
                }
            }

        }
        //aa return kariu che...
        ArrayList<Integer> I = new ArrayList<Integer>(2);
        I.add(large+1);
        I.add(secondLarge+1);
        return I;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println(large_and_SecondLarge(arr));

    }
}
