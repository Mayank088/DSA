package ArrayList;

public class maximum_appearing_element
{
    public static int maxApprar(int left[] , int right[])      //time : O(n * max) max=100  , space : (1)
    {
        int n = left.length;    //left and right contains same number of element.
        int freq[] = new int[100];
        for (int i=0 ; i<n ; i++)
        {
            for (int j = left[i] ; j<=right[i] ; j++)
            {
                freq[j] = freq[j] + 1;
            }
        }
        int res = 0;
        for (int i=1 ; i<100 ; i++)
        {
            if (freq[i] > freq[res])
            {
                res = i;
            }
        }
        return res;
    }


    public static int maxAppear2(int left[] , int right[])
    {                                       //time : O(n + max) max=100  , space : (1)
        int n = left.length;
        int freq[] = new int[101];
        for (int i=0 ; i<n ; i++)
        {
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }

        int res = 0;
        for (int i=1 ; i<101 ; i++)
        {
            freq[i] = freq[i-1] + freq[i];
            if (freq[i] > freq[res])
            {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int left[] = {1,2,4};
        int right[] = {4,5,7};
        int ans = maxApprar(left , right);
        System.out.println(ans);

        int ans2 = maxAppear2(left , right);
        System.out.println(ans2);
    }
}
