package ArrayList;

public class max_value_diff
{
    public static int max(int arr[])
    {
        int n = arr.length;            //time complexity = theta(n^2)   , aux : O(1)
        int diff;                       //time complexity = O(n^2) , O pan kahi saki but theta vadhu saru kevai karnke ahi aapne khbar j che ke ketli var loop farse ane beei loop n var farvani j che pela j ans madi jase toi pan atle theta jo pela no khabar hoy ne ane ans madi jai atle loop ubhi rai jai evu hoy to worst case kai ne O(n^2) aam kahi saki big O em
        int max_diff=0;    //it is only for positive number only {30,10,8,2} in this ex. ans is 8-10=(-2) but it gives positive number
        for (int i=0; i<n ; i++)
        {
            for (int j = i+1 ; j<n ; j++)
            {
                if (arr[i] < arr[j])
                {
                    diff = arr[j] - arr[i];
                    max_diff = Math.max(diff,max_diff);
                }
            }
        }
        return max_diff;
    }


    //or sir nu logic

    public static int max2(int arr[])
    {
        int n = arr.length;                     //time complexity = theta(n^2)   , aux : O(1)
        int res = arr[1] - arr[0];
        for (int i=0 ; i<n-1 ; i++)
        {
            for (int j = i+1 ; j<n ; j++)
            {
                res = Math.max(res , arr[j] - arr[i]);
            }
        }
        return res;
    }



    //efficient sol.

    public static int max3(int arr[])
    {
        int n = arr.length;             //time complexity = theta(n)   , aux : O(1)
        int res = arr[1] - arr[0];
        int minValue = arr[0];

        for (int j = 1 ; j<n ; j++)
        {
            res = Math.max( res , (arr[j]-minValue ) );
            minValue = Math.min(minValue , arr[j]);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {30,10,8,2};
        int ans = max3(arr);
        System.out.println(ans);

    }
}
