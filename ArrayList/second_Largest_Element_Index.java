package ArrayList;

public class second_Largest_Element_Index {
    public static int gretest(int arr[])
    {
        int n = arr.length;
        int res = 0;
        for (int i=1 ; i<n ; i++)
        {
            if (arr[i]>arr[res])
            {
                res = i;
            }
        }
        return res;
    }

    public static int secondLarge(int arr[])
    {                                           //time complexity : O(n+n) = O(n)
        int large = gretest(arr);
        int n = arr.length;
        int max = -1;
        for (int i=0 ; i<n ; i++)
        {
            if (arr[i] != arr[large])
            {
                if (max == -1)
                {
                    max = i;
                }
                else if (arr[i] > arr[max])
                {
                    max = i;
                }
            }
        }
        return max;
    }

    //or

    public static int secondLargeDirect(int arr[])
    {                        //time commplexity = theta(n)
        int n = arr.length;
        int largest=0;
        int res=-1;      //res = second large element

        for(int i=1; i<n; i++)
        {
            if(arr[i] > arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest])
            {
                if(res==-1 || arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12,15,21,19,5};
        int ans = secondLarge(arr);
        System.out.println(ans);  //ans = 3 => arr[3] = 19 which is second large

        int ans2 = secondLargeDirect(arr);
        System.out.println(ans2);
    }
}
