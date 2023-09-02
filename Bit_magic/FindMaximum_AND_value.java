package Bit_magic;

public class FindMaximum_AND_value {

    int maximumvalue(int arr[] , int n){
        int maxi=0;
        for (int i=0; i < n; i++){
            for (int j = i+1; j<n; j++){
                maxi = Math.max( maxi , (arr[i] & arr[j]) );
            }
        }
        return maxi;
    }

    int checkBit(int pattern , int arr[] , int n){
        int count = 0;
        for (int i = 0; i < n; i++)
            if ((pattern & arr[i]) == pattern)
            {
                count++;
            }
        return count;
    }

    int maximumvalue2(int arr[] , int n){
        int res = 0, count;

        // iterate over total of 32bits
        // from msb to lsb
        for (int bit = 31; bit >= 0; bit--) {
            // find the count of element
            // having set msb
            count = checkBit(res | (1 << bit), arr, n);

            // if count >= 2 set particular
            // bit in result
            if (count >= 2) {
                res = res | (1 << bit);
            }
        }
        return res;
    }



    public static void main(String args[]){
        int arr[] = {4,8,12,2};
        int n = arr.length;

        FindMaximum_AND_value f = new FindMaximum_AND_value();
        int ans = f.maximumvalue(arr,n);
        System.out.println(ans);

        int ans2 = f.maximumvalue2(arr,n);
        System.out.println(ans2);
    }
}
