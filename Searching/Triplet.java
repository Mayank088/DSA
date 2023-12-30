package Searching;
//in array any 3 element sum is equal to the x
public class Triplet {

    public static boolean isTriplet(int arr[] , int x)      //time (n*3)
    {
        int n = arr.length;
        for (int i = 0 ; i<n-2 ; i++)
        {
            for (int j = i+1 ; j<n-1 ; j++)
            {
                for (int k = j+1 ; k<n ; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == x)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean isTriplet2(int arr[] , int x)    //time (n*2) ,  if unsoted then also O(n*2)
    {
        int n = arr.length;
        // Arrays.sort(arr);        time (n * logn)
        for (int i = 0; i < n - 2; i++)
        {
            int j = i + 1;
            int k = n - 1;
            while (j < k)
            {
                if (arr[i] + arr[j] + arr[k] == x)
                {
                    return true;
                }
                else if (arr[i] + arr[j] + arr[k] < x)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }

        }
        return false;
    }



    public static void main(String[] args) {
        int arr[] = {2,3,5,15};
        int x = 20;         //(2+3+15 = 20)

        boolean ans = isTriplet2(arr,x);
        System.out.println(ans);

    }
}
