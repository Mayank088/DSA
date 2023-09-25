package ArrayList;

public class reverse {
    public static void rev(int arr[])
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

    public static void main(String[] args)
    {
        int arr[] = {4,7,9,20};
        int n = arr.length;

        System.out.println("Before Reverse");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        rev(arr);      //calling

        System.out.println("After Reverse");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
