package Matrix;
//only 2*2 mate j
public class subtraction_of_matrix
{
    public static void sub(int a[][] , int b[][])
    {
        int n1 = a.length;
        int n2 = b.length;
        int ans[][] = new int[n1][n2];

        for (int i=0 ; i<n1 ; i++)
        {
            for (int j=0 ; j<n2 ; j++)
            {
                ans[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i=0 ; i<ans.length ; i++)
        {
            for (int j= 0 ; j<ans[i].length ; j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {
        int a[][] = {{5, 6},
                     {8, 9}};

        int b[][] = {{1, 2},
                    {4, 5}};

        sub(a,b);
    }
}
