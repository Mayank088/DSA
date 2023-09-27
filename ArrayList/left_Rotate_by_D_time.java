package ArrayList;

public class left_Rotate_by_D_time
{
    public static void leftRotateby1(int arr[])
    {
        int n = arr.length;             // time : theta(n)
        int temp = arr[0];
        for (int i=1 ; i<n ; i++)
        {
             arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void leftRotateby_D_time(int arr[] , int D)
    {
        for (int i=0 ; i<D; i++)           //time : D * theta(n)
        {
            leftRotateby1(arr);          //calling function
        }
    }


    //or better

    public static void leftRotateby_D_time2(int arr[] , int D)
    {
        int n = arr.length;                  //time : theta(n)   , aux = theta(D)
        int temp[] = new int[D];

        for (int i=0 ; i<D ; i++)                //time = theta(D)
        {
            temp[i] = arr[i];            //temp = {1,2}
        }

        for (int i=D ; i<n ; i++)               //time = theta(n - D)
        {
            arr[i-D] = arr[i];    // arr[] = {3,4,5,4,5}
        }

        for (int i=0 ; i<D ; i++)              //time = theta(D)
        {
            arr[n-D+i] = temp[i];   // arr[] {3,4,5,1,2}
        }
    }
    //time : theta(D + n-D + D)  => theta(D + n)   => theta(n) ignore D because D is smaller then n


    //or reversal sol.

    public static void leftRotate_by_reversal(int arr[] , int D)
    {
        int n = arr.length;               //time : theta(n) , aux : theta(1)
        reverse(arr, 0 , D-1);                  //time : theta(D)
        reverse(arr , D , n-1);                     //time : theta(n - D)
        reverse(arr, 0 , n-1);                  //time : theta(n)
    }
    //time : (D + n-D + n)  => theta(2n) => theta(n)
    public static void reverse(int arr[] , int low , int high)
    {
            while (low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        leftRotateby_D_time2(arr,2);      //asn = 3 4 5 1 2
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int arr2[] = {1,2,3,4,5};
        leftRotate_by_reversal(arr2,2);
        for (int i=0 ; i<arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");             // 3 4 5 1 2
        }
    }
}
