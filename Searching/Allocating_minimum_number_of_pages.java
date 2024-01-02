package Searching;

public class Allocating_minimum_number_of_pages {

    public static int minpage(int arr[] , int n , int k)
    {
        if (k==1)
        {
            return sum(arr,0,n-1);
        }

        if (n==1)
        {
            return arr[0];
        }

        int res = Integer.MAX_VALUE;   //res = infinte
        for (int i=1 ; i<n ; i++)
        {
            res = Math.min(res ,   Math.max( minpage(arr,i,k-1) , sum(arr,i,n-1) )  );
        }
        return res;
    }


    public static int sum(int arr[] , int start , int end)
    {
        int sum = 0;
        for (int i=start ; i<=end ; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }




    //allocating minimum page using binary searcch

    public static int minPage2(int arr[] , int n , int k)   // time = O(n*log(sum))
    {
        int max = 0;
        for (int i=0; i<n-1 ; i++)
        {
            if (arr[i]<arr[i+1])
            {
                max = arr[i+1];
            }
        }

        int sum = 0;
        for (int i=0 ; i<n ;i++)
        {
            sum = sum + arr[i];
        }

        int start = max;             //range of allocating page is between maximum number of page and total page
        int end = sum;              //{10,20,10,30} range is 30 to 70
        int res = 0;
        while (start<=end)
        {
            int mid = (start+end)/2;

            if (isFeasible(arr,n,k,mid)==true)
            {
                res = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return res;
    }

    public static boolean isFeasible(int arr[], int n , int k , int ans)
    {
        int student=1 , sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum + arr[i] > ans)
            {
                student++;
                sum=arr[i];  //je index par ubho ryo tiya ti sum chalu karse navo mid = 39 => 10+20 , 10 , 30
                            //aama 10+20 pachi vadhi gayo 40 thay atle sum = arr[2] = 10 ti start thase
                            //have sum = sum+arr[3] = 10+30 thaya to pachu ubho rese student++ karse ane navo sum chalu karse
            }
            else
            {
                sum = sum + arr[i];
            }
        }
        return (student <= k);            // k karta student vadhu hase to false return karse
    }



    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int n = arr.length;
        int k = 2;

        int ans = minpage(arr,n,k);
        System.out.println(ans);


        int arr2[] = {10,20,10,30};
        int n1 = arr2.length;
        int k1 = 2;
        int ans2 = minPage2(arr2,n1,k1);
        System.out.println(ans2);
    }
}
