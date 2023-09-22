package ArrayList;

public class Equlibrium_index_of_array
{

    int preCompute(int arr[], int sum[], int n)
    {                                   //time: O(n)
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = arr[i] + sum[i - 1];
        }

        int total = sum[n - 1];        //last index par je hse te total hase n-1 te last index che

        for (int i = 0; i < n - 1; i++) {
            int rightsum = total - sum[i];
            int leftsum = sum[i] - arr[i];

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }


    int suminex(int arr[], int n)
    {                                           //time = O(n^2)
        int i, j;
        int leftsum, rightsum;

        for (i = 0; i < n; ++i)
        {
            leftsum = 0;
            for (j = 0; j < i; j++){
                leftsum += arr[j];
            }

            rightsum = 0;
            for (j = i + 1; j < n; j++){
                rightsum += arr[j];
            }


            if (leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }

        public static void main (String[] args)
        {
            Equlibrium_index_of_array e = new Equlibrium_index_of_array();

            int arr[] = {1, 2, 6, 4, 0, -1};
            int n = arr.length;
            int sum[] = new int[n];

            //khali array banaviyo andar kai value nathi bas
            // arr ni jetli size che te j size no empty array banviyo

            int ans = e.preCompute(arr, sum, n);
            System.out.println(ans);
            //ans = 2 je index 2 par che te eq. point che


            int ans2 = e.suminex(arr, n);
            System.out.println(ans2);
        }

}
