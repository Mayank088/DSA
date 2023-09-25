package ArrayList;

public class Group_reverse
{
    public static void rev(int arr[] , int k)
    {
        if (arr.length==k)
        {
            int n = arr.length;       //time complexity : theta(n)    , aux : theta(1)
            int start = 0;
            int end = n-1;
            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        if(k<arr.length)
        {
            int start = 0;
            int end = k-1;
            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            int newstart = k+1;
            int newend = arr.length-1;
            while (newstart < newend)
            {
                int temp = arr[newstart];
                arr[newstart] = arr[newend];
                arr[newend] = temp;
                newstart++;
                newend--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,6,8,9};
        int k = 3;

        rev(arr,k);

        System.out.println("After Reverse");
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
