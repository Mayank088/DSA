package Matrix;
//here n*n matrix is rotate so a.length in both loop
public class Rotate_matrix_by_90_degree
{
    public static void rotate(int a[][])      //time = theta(n^2) , space = theta(n^2)
    {
        int temp[][] = new int[a.length][a.length];
        for (int i=a.length-1 ; i>=0 ; i--)
        {
            for (int j=0 ; j<a.length ; j++)
            {
                temp[a.length-1-i][j] = a[j][i];
            }
        }

        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a.length ; j++)
            {
                a[i][j] = temp[i][j];
            }
        }

        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a.length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    //efficient approch => first we can Transpose the matrix then reverse the column.
    public static void rotate2(int a[][])  //time = theta(n^2) , space = theta(1)
    {
        //transpose the matrix
        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=i+1 ; j<a.length ; j++)
            {
                //swap(a[i][j] , a[j][i])
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //reverse the column
        for (int i=0 ; i<a.length ; i++)
        {
            int low = 0 , high = a.length-1;
            while (low<high)
            {
                //swap(a[low][i]  , a[high][i])  low++ high--
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;

                low++;
                high--;
            }
        }

        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a.length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args)
    {
        int a[][] = {{1,2,3} ,
                     {4,5,6} ,
                     {7,8,9}};
        rotate2(a);
    }
}
