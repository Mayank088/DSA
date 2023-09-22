package ArrayList;

public class LargestElement {

    public static int greatest(int arr[])
    {                               //time complexity : O(n^2)
        int n = arr.length;
        for (int i=0 ; i < n ;i++)
        {
            boolean flag = true;

            for (int j=i ; j<n ; j++)
            {
                if (arr[j] > arr[i])
                {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
            {
                return i;
            }
        }
        return -1;   //naver rich in this -1 beacuse koi ek to moto hoy j
    }


    public static int greatest2(int arr[])
    {                                       //time complexity : theta(n)
        int n = arr.length;
        int res = 0;
        for (int i=0; i<n; i++)
        {
            if (arr[i]>arr[res])
            {
                res = i;
            }
        }
       return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,3,4};
        int ans = greatest(arr);
        System.out.println(ans);

        int arr2[] = {5,8,20,4};
        int ans2 = greatest2(arr2);
        System.out.println(ans2);
    }
}
