package ArrayList;


// i/p : {1,2,3,4,5}
// o/p : {2,3,4,5,1}
public class left_Rotate_by_1
{
    void L_rotate(int arr[])
    {
        int n = arr.length;         //time : theta(n)   , aux : theta(1)
        int temp = arr[0];

        for (int i=1 ; i<n ; i++)
        {
            arr[i-1] = arr[i];            //it print the {2,3,4,5,5}
        }

        arr[n-1] = temp;           //it modify and then print the {2,3,4,5,1}
    }

    public static void main(String[] args)
    {
        left_Rotate_by_1 l = new left_Rotate_by_1();
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        l.L_rotate(arr);
        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
