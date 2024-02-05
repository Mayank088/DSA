package Matrix;

public class Print_matrix_in_snake_pattern {

    public static void print(int a[][])
    {
        for (int i=0 ; i<a.length ; i=i+2)
        {
            for (int j=0 ; j<a[i].length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }

            for (int k=a[0].length-1 ; k>=0 ; k--)
            {
                if (i+1 < a.length)
                {
                    System.out.print(a[i + 1][k] + " ");
                }
            }
        }
    }

    //or sandeep sir method
    public static void print2(int a[][])
    {
        for(int i = 0; i < a.length; i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0; j < a[0].length ; j++)
                    System.out.print(a[i][j] + " ");
            }
            else
            {
                for(int j = a[i].length - 1; j >= 0; j--)
                    System.out.print(a[i][j] + " ");
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
        int b[][] = {{1,2,3,4} ,
                    {5,6,7,8} ,
                    {9,10,11,12}};
        print2(b);
    }
}
