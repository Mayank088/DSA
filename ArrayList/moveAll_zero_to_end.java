package ArrayList;

public class moveAll_zero_to_end
{

    public static void moveZero(int arr[])
    {
        int n = arr.length;               //time : O(n^2)   , aux : O(1)

        for (int i=0 ; i<n ;i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i+1 ; j<n ; j++)
                {
                    if (arr[j] != 0)
                    {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    public static void moveZero2(int arr[])
    {
        int n = arr.length;         //time : O(n)   , aux : O(1)
        int count = 0;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10,5,0,0,8,9,0};
        int n = arr.length;
        moveZero2(arr);

        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
