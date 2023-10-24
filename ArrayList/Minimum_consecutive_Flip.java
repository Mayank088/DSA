package ArrayList;

public class Minimum_consecutive_Flip
{
    public static void flip(int arr[])           //time : O(1)  , space : O(1)
    {
        int n = arr.length;
        for (int i=1 ; i<n ; i++)
        {
            if (arr[i] != arr[i-1])
            {
                if (arr[i] != arr[0])
                {
                    System.out.print("form " + i + " to ");
                }
                else
                {
                    System.out.println(i-1);
                }
            }
        }
        if (arr[0] != arr[n-1])
        {
            System.out.println(n-1);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0};

        flip(arr);
    }
}
