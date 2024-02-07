package Matrix;

public class search_element_in_sorted_matrix
{
    public static void search(int a[][] , int x)     //time: O(r*c)
    {
        for (int i=0 ; i<a.length ; i++)
        {
            for (int j=0 ; j<a[i].length ; j++)
            {
                if (a[i][j]==x)
                {
                    System.out.print("found at [" + i + "]" + "[" + j + "]");
                    return;
                }
            }
        }
        System.out.print("Not found");
    }

    //efficinet sol.
    public static void search2(int a[][] , int x)         //time: O(r+c)
    {
        int i=0;
        int j=a[0].length-1;       //top right corner element here 40 in ex.
        while (i<a.length && j>=0)
        {
            if (a[i][j]==x)
            {
                System.out.print("found at [" + i + "]" + "[" + j + "]");
                return;
            }
            else if(a[i][j]>x)
            {
                j--;          //go left
            }
            else {
                i++;       //go down
            }
        }
        System.out.print("Not found");

    }

    public static void main(String[] args)
    {
        int a[][] = {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int x = 29;
        search(a , x);

        System.out.println(" ");

        search2(a,x);
    }
}
