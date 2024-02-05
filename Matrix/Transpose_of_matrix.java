package Matrix;

//transpose matrix if and if possible when n*n matrix are there if(row and column are same then it is possible)
public class Transpose_of_matrix
{
    //naive apporch (create temp array)
    public static void transpose(int a[][])
    {
        int temp[][] = new int[a.length][a[0].length];
        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a[0].length ; j++)
            {
                temp[i][j] = a[j][i];
            }
        }
        //copy temp element into the original
        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a[0].length ; j++)
            {
                a[i][j] = temp[i][j];
            }
        }

        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a[0].length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void transpose2(int a[][])
    {
        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=i+1 ; j<a[0].length ; j++)
            {
                //swap(a[i][j] , a[j][i])
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a[0].length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args)
    {
        int a[][] = {{1,2,3,4} ,
                     {5,6,7,8} ,
                     {9,10,11,12} ,
                     {13,14,15,16}};

        transpose(a);

        System.out.println(" ");

        int ab[][] = {{1,2,3,4} ,
                    {5,6,7,8} ,
                    {9,10,11,12} ,
                    {13,14,15,16}};
        transpose2(ab);
    }
}
