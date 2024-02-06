package Matrix;

public class multiplication_of_size_matrix {

    public static void multiplyMatrix(int A[][], int B[][])
    {
        int ans[][] = new int[A.length][B[0].length];
        for(int i=0 ; i<A.length ; i++)
        {
            if(A[i].length != B.length)
            {
               int empty[][] = new int[0][0];
            }
            for(int j=0 ; j<B[0].length ; j++)
            {
                for(int k=0; k<B.length ; k++)
                {
                    ans[i][j] += A[i][k] * B[k][j];
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

    public static void main(String[] args) {
        int A[][] = {{4, 8},
                     {0, 2},
                     {1, 6}};

        int B[][] = {{5, 2},
                     {9, 4}};

        multiplyMatrix(A,B);
    }
}
