package sorting;

public class counting_sort {
//this naive is not general purpose sol. because it is not slove where multiple object
// like sort the student accroding to marks

    public static void sort(int arr[] , int k)    //naive sol theta(n+k)
    {
        int count[] = new int[k];
        //fill all count element as 0
        for (int i=0 ; i<k ; i++)          //theta(k)
        {
            count[i] = 0;
        }

        //count how many time element occur in array
        for (int i=0 ; i<arr.length ; i++)    //theta(n)
        {
            count[arr[i]]++;
        }

        int index=0;
        for (int i=0 ; i<k ; i++)                       //theta(n+k)
        {
            for (int j=0 ; j < count[i] ; j++)
            {
                arr[index] = i;
                index++;
            }
        }
    }

    //efficient sol.
    public static void sort2(int arr[] , int k)                   // theta(n+k)
    {
        int count[] = new int[k];
        //fill all count element as 0
        for (int i=0 ; i<k ; i++)          //theta(k)
        {
            count[i] = 0;
        }

        //count how many time element occur in array
        for (int i=0 ; i<arr.length ; i++)    //theta(n)
        {
            count[arr[i]]++;
        }

        //cumeletive
        for (int i=1 ; i<k ; i++)
        {
            count[i] = count[i-1] + count[i];
        }

        int output[] = new int[arr.length];
        for (int i=0 ; i<arr.length ; i++)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for (int i=0 ; i<arr.length ; i++)
        {
            arr[i] = output[i];
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,4,4,1,0,1};
        sort2(arr,5);
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");;
        }
    }
}
