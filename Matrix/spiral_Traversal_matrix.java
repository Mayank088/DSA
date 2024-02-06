package Matrix;

public class spiral_Traversal_matrix
{
    public static void spiral(int a[][])
    {
        int top=0;
        int bottom = a.length-1;        //row-1
        int right = a[0].length-1;     //column-1
        int left = 0;

        while (top <= bottom && left <= right)
        {
            for (int i=left ; i<=right ; i++)   //print top row
            {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i=top ; i<=bottom ; i++)  //print right column
            {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if (top<=bottom)
            {
                for (int i=right ; i>=left ; i--)         //print bottom row in revers
                {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left<=right)
            {
                for (int i=bottom ; i>=top ; i--)       //print left column in reverse
                {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args)
    {
        int a[][] = {{1,2,3,4} ,
                    {5,6,7,8} ,
                    {9,10,11,12} ,
                    {13,14,15,16}};

        spiral(a);
    }
}
