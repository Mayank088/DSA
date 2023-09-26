package ArrayList;

public class right_Rotate_by_1
{
    public static void R_rotate(int arr[])
    {
        int n = arr.length;         //time : theta(n)   , aux : theta(1)
        int temp = arr[n-1];

        for (int i=n-1 ; i>0 ; i--)
        {
            arr[i] = arr[i-1];              // {1,1,2,3,4}
        }

        arr[0] = temp;          // {5,1,2,3,4}
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        R_rotate(arr);
        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
