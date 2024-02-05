package Matrix;

public class Print_boundery_Element
{
    public static void print(int a[][])
    {
        //only one row
        if (a.length == 1)
        {
            for (int i=0 ; i<a.length ; i++)
            {
                System.out.print(a[0][i] + " ");
            }
        }

        //only one column
        else if (a[0].length == 1)
        {
            for (int i=0 ; i<a[0].length ; i++)
            {
                System.out.print(a[i][0] + " ");
            }
        }
        else
        {
            //peli line(row) print karse.
           for (int i=0 ; i<=a[0].length-1 ; i++)
           {
               System.out.print(a[0][i] + " ");
           }
           //last column print karse
           for (int i=1 ; i<=a.length-1 ; i++)
           {
               System.out.print(a[i][a[i].length-1] + " ");
           }
           //last row print karse
           for (int i=a[0].length-2 ; i>=0 ; i--)
           {
               System.out.print(a[a.length-1][i] + " ");
           }
           //first column niche ti print karse
           for (int i=a.length-2 ; i>=1 ; i--)
           {
               System.out.print(a[i][0] + " ");
           }
        }
    }

    public static void main(String[] args)
    {
        int a[][] = {{1,2,3,4} ,
                    {5,6,7,8} ,
                    {9,10,11,12} ,
                    {13,14,15,16}};
        print(a);

        System.out.println(" ");
        int b[][] = {{12, 11, 10, 9},
                     {8, 7, 6, 5},
                     {4, 3, 2, 1}};
        print(b);
    }
}
