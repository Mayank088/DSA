package Matrix;

public class multidimension_array
{
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},
                        {4,5,6}};

        for (int i=0 ; i<arr.length ; i++)
        {
            for (int j=0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
        }

        System.out.println(" ");

        int arr2[][] = {{1,2,3,8,9},
                        {4,5,6}};

        for (int i=0 ; i<arr2.length ; i++)
        {
            for (int j=0 ; j<arr2[i].length ; j++)
            {
                System.out.print(arr2[i][j] +" ");
            }
        }

        System.out.println(" ");
        //other method to define 2D array
        int m = 2, n = 3;

        int arr3[][] = new int[m][n];

        for (int i=0 ; i<arr3.length ; i++)
        {
            for (int j=0 ; j<arr3[i].length ; j++)
            {
                arr3[i][j] = 10;
                System.out.print(arr3[i][j] +" ");
            }
        }

        //jagged array
        System.out.println(" ");

        int x = 3;

        int arr4[][] = new int[x][];

        for (int i=0 ; i<arr4.length ; i++)
        {
            arr4[i] = new int[i+1];
            for (int j=0 ; j<arr4[i].length ; j++)
            {
                arr4[i][j] = i;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
