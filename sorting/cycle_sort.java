package sorting;

public class cycle_sort {

    public static void cycleSort(int arr[])   //time in all case O(n^2)
    {
        for (int cs=0 ; cs<arr.length-1 ; cs++)
        {
            int pos = cs;
            int item = arr[cs];

            for (int i=cs+1 ; i<arr.length ; i++)
            {
                if (arr[i]<item)
                {
                    pos++;
                }
            }
            //swap(arr[pos] , item)
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (cs != pos)
            {
                pos = cs;
                for (int i=cs+1 ; i<arr.length ; i++)
                {
                    if (arr[i]<item)
                    {
                        pos++;
                    }
                }
                //swap(item , arr[pos])
                int temp1 = item;
                item = arr[pos];
                arr[pos] = temp1;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {20,40,50,10,30};

        cycleSort(arr);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
