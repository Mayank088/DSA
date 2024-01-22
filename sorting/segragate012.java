package sorting;

public class segragate012
{
    public static void segragate(int arr[], int N)
    {
        // Your Code Here
        int zero=0 , one=0 , two=0;
        for(int i=0 ;i<N ; i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }

        int i=0;
        while(zero>0)
        {
            arr[i]=0;
            i++;
            zero--;
        }
        while(one>0)
        {
            arr[i]=1;
            i++;
            one--;
        }
        while(two>0) {
            arr[i] = 2;
            i++;
            two--;
        }
    }


    public static void main(String[] args)
    {
        int arr[]  = { 0 ,2 ,1 ,2 ,0 , 2 ,1};
        int n = arr.length;
        segragate(arr,n);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
