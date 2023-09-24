package ArrayList;

public class is_Sorted {
    boolean sorted(int arr[])
    {                               //time complexity = O(n^2)
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[i])
                {
                    return false;
                }
            }
        }
        return true;
    }



    static boolean sorted2(int arr[])
    {                               //time complexity = O(n)
        int n = arr.length;
        if (n==1)
        {
            return true;
        }
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,25,7,3,4,6};

        is_Sorted s = new is_Sorted();
        boolean ans = s.sorted(arr);
        System.out.println(ans);
    }
}
