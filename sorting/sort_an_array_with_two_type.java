package sorting;

//this is ask many type like
//1) segregate positive and negative
//2) segregate even and odd
//3) segregate 0's and 1's      or (sort binary array)
public class sort_an_array_with_two_type
{
    public static void segregate(int arr[])              //time : O(n) , space O(n)
    {
        int n = arr.length;
        int temp[] = new int[n];
        int index = 0;
        for (int j=0 ; j<n ; j++)
        {
            if (arr[j]<0)
            {
                temp[index] = arr[j];
                index++;
            }
        }
        for (int j=0 ;j<n ; j++)
        {
            if (arr[j]>=0)
            {
                temp[index] = arr[j];
                index++;
            }
        }


        for (int i=0 ;i<n ; i++)
        {
            arr[i] = temp[i];
        }
    }


    //effiencent sol. is to use hoare or lomuto partiton
    //beacuse it does one type of element first and other type of element in second part

    public static void segregate2(int arr[] , int low , int high)  //hoare ==> time : O(n) , space (1)
    {
        int i = low-1;
        int j = high+1;      //high is last index

        while (true)
        {
            do {
                i++;
            }while (arr[i]<0);

            do {
                j--;
            }while (arr[j]>=0);

            if (i>=j)
            {
                return;
            }
            //swap(arr[i] , arr[j])
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //or

    public static void segregate3(int arr[] , int low, int high)
    {
        int i=low-1;
        int pivot = 0;
        for (int j=1 ; j<arr.length ; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                //swap(arr[i] , arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }   //ahi pivot ne potani palce par lai aavani jarur nathi atle halse swap(arr[i+1] , arr[high]) nahi kari to pn
    }

    public static void main(String[] args)
    {
        int arr[] = {12,35,-10,-2,33,50};
        int low = 0;
        int high = arr.length-1;
        segregate2(arr,low,high);
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
