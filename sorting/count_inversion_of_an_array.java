package sorting;

//inversion means i<j and arr[i]>arr[j] then it is called as inversion of array.


//Input: N = 5, arr[] = {2, 4, 1, 3, 5}
//Output: 3
//Explanation: The sequence 2, 4, 1, 3, 5
//has three inversions (2, 1), (4, 1), (4, 3).
public class count_inversion_of_an_array
{
    public static int inversion(int arr[])      //time: O(n^2) , space = O(1)
    {
        int n = arr.length;
        int count = 0;

        for (int i=0 ; i<n-1 ;i++)
        {
            for (int j=i+1 ; j<n ; j++){
                if (arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static int countInv(int arr[], int l, int r)        //time:O(n * logn) , space : O(n)
    {
        int res = 0;
        if (l<r)
        {
            int m = (r + l) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
    return res;
    }

    public static int countAndMerge(int arr[], int l, int mid, int r)
    {
        int n = mid-l+1;
        int m = r-mid;
        int[] left=new int[n];
        int[] right=new int[m];
        for(int i=0;i<n;i++)
        {
            left[i]=arr[i+l];
        }

        for(int j=0;j<m;j++)
        {
            right[j]=arr[mid+1+j];
        }

        int res=0,i=0,j=0,k=l;
        while(i<n && j<m)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
                res = res + (n-i);
            }
        }
        while(i<n)
        {
            arr[k++]=left[i++];
        }

        while(j<m)
        {
            arr[k++]=right[j++];
        }
        return res;
    }



    public static void main(String[] args)
    {
        int arr[] = {2,4,1,3,5};
        int arr1[] = {10,20,30,40};
        int arr2[] = {40,30,20,10};
        int ans = countInv(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
