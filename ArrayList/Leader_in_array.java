package ArrayList;

public class Leader_in_array
{
    public static void leader(int arr[])
    {                                //time : O(n^2)      , Auxiliary Space: O(1)
        int n = arr.length;
        for (int i=0; i<n ; i++)
        {
            boolean flag = true;

            for (int j=i+1 ; j<n ; j++)
            {
                if (arr[i] <= arr[j])
                {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }



    public static void leader2(int arr[])
    {                                   //  Time : O(n)      , Auxiliary Space: O(1)
        int n =arr.length;
        int current_leader = arr[n-1];
        System.out.print(current_leader + " ");

        for (int i = n-2 ; i >= 0 ; i--)
        {
            if (current_leader < arr[i])
            {
                current_leader = arr[i];
                System.out.print(current_leader + " ");
            }
        }
    }
    //but ama leader reverse ma print thase tene pele ti print karva hoy to
    // ek temp[] banavi tema store karva and aa temp ne reverse karvo
    //and then Time : O(n) ,  Auxiliary Space: O(n)

    public static void main(String[] args)
    {

        int arr[] = {7,10,4,3,6,5,2};
        leader(arr);

        System.out.println(" ");

        int arr2[] = {7,10,4,3,6,5,2,4};
        leader2(arr2);
    }
}
