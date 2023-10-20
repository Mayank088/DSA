package ArrayList;

public class Max_consecutive_onec
{
    public static int onec1(int arr[])           //time  = O(n^2)  , space = O(1)
    {
        int n = arr.length;
        int res=0;
        for (int i=0 ; i<n ; i++)
        {
            int curr = 0;
            for (int j=i ; j<n ; j++)
            {
                if (arr[j]==1)
                {
                    curr++;
                }
                else
                {
                    break;
                }
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    public static int onec2(int arr[])
    {                                       //time  = O(n)  , space = O(1)
        int n = arr.length;
        int res=0;
        int curr=0;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i]==0)
            {
                curr=0;
            }
            else
            {
                curr++;
                res = Math.max(curr , res);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int arr[] = {0,1,1,0,1,1,1,0};
        int ans = onec2(arr);
        System.out.println(ans);
    }
}
