package ArrayList;

public class Majority_element
{
    public static int majority(int arr[])
    {                                        //time : O(n^2)   , space : O(1)
        int n = arr.length;
        for (int i=0 ; i<n ; i++)
        {
            int count = 1;
            for (int j=i+1 ; j<n ;j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count > (n/2) )
            {
                return i;
            }
        }
        return -1;
    }


    public static int findMajority(int arr[])
    {                                       //time : O(n)   , space : O(1)
        int n = arr.length;
        int res = 0;
        int count = 1;
        for (int i=1 ; i<n ; i++)
        {
            if (arr[res] == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }

            if (count == 0)
            {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i=0; i<n ;i++)
        {
            if (arr[res] == arr[i])
            {
                count++;
            }
        }
        if (count <= (n/2))
        {
            res = -1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {3,1,4,1,1};
        int ans = majority(arr);
        System.out.println(ans);

        int arr2[] = {8,8,6,6,6,4,6};
        int ans2 = findMajority(arr2);
        System.out.println(ans2);

    }
}
