package sorting;

public class intersection_of_two_sorted_array
{
    public static void intersection(int arr1[] , int arr2[])     //time O(n*m) , space O(1)
    {
        int n = arr1.length;
        int m = arr2.length;

        for (int i=0; i<n ; i++)
        {
            if (i>0 && arr1[i]==arr1[i-1])      //to avoid duplicate
            {
                continue;     //atle 2 same hase to print nai kare
            }

            for (int j=0 ; j<m ; j++)
            {
                if (arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                    break;          //to avoid the duplicate
                }
            }
        }
    }


    //using merge sort's merge function logic

    public static void intersection2(int arr1[] ,int arr2[])      //time O(n+m) , space O(1)
    {
        int i=0;
        int j=0;

        while (i<arr1.length && j<arr2.length)
        {
            if (i>0 && arr1[i]==arr1[i-1])      //to avoid duplicate
            {
                i++;
                continue;                   //atle 2 same hase to print nai kare
            }

            if (arr1[i] == arr2[j])
            {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr1[] = {3,5,10,10,10,15,15,20};
        int arr2[] = {5,10,10,15,30};

        intersection(arr1,arr2);
        
        intersection2(arr1,arr2);
    }
}
