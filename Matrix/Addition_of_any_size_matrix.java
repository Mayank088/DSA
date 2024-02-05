package Matrix;

public class Addition_of_any_size_matrix
{
    public static void sumMatrix(int A[][], int B[][])
    {

        int ans[][] = new int[A.length][A[0].length];

        if(A.length == B.length && A[0].length == B[0].length)
        {
            for(int i=0 ; i<A.length ; i++)
            {
                for(int j=0 ; j<A[0].length ; j++)
                {
                    ans[i][j] = A[i][j] + B[i][j];
                }
            }
        }
        else
        {
            ans = new int[1][1];
            ans[0][0] = -1;
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
        int a[][] =  {{1, 2, 3},
                       {4, 5, 6}};

        int b[][] = {{1, 3, 3},
                    {2, 3, 3}};

        sumMatrix(a,b);
    }
}
