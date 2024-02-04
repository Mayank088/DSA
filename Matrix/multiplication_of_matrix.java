package Matrix;
//2*2 matrix
public class multiplication_of_matrix {
    public static void mul(int a[][] , int b[][])
    {
        int m=2 , n=2 , p=2;
        int ans[][] = new int[m][p];

        for (int i=0 ; i<m ; i++)
        {
            for (int j=0 ; j<p ; j++)
            {
                ans[i][j] = 0;

                for (int k=0 ; k<n ; k++)
                {
                    ans[i][j] = ans[i][j] + (a[i][k] * b[k][j]);
                }
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
        int a[][] =  { { 5, 6 },
                       { 8, 9 } };

        int b[][] = { { 1, 2 },
                      { 4, 5 } };

        mul(a,b);
    }
}
