package Matrix;

public class passing_2D_array_as_argument
{
    public static void printing(int arr[][])
    {
        for (int i=0 ; i<arr.length ; i++)
        {
            for (int j=0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},{4,5,6}};
        printing(arr);

    }
}
