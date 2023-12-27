package Searching;
//i/p = arr[] = {1,3,79,90,100,300,405, .........}
public class Search_in_Infinite_Sized_Sorted_Array {

    public static int search(int arr[] , int x)
    {
        int i=0;
        while (true)
        {
            if(arr[i]==x)
            {
                return i;
            }
            if (arr[i] > x)
            {
                return -1;
            }
            i++;
        }
    }


    //we can not use directly binary search in infinte array beacuse we do not have end element.
    public static int binary_Search(int arr[] , int x , int start , int end)
    {
            if (start > end)
            {
                return -1;
            }

            int mid = (start+end)/2;

            if (arr[mid]==x)
            {
                return mid;
            }
            else if (arr[mid] < x)
            {
                return binary_Search(arr,x,mid+1,end);
            }
            else
            {
                return binary_Search(arr,x,start,mid-1);
            }

    }
    public static int search2(int arr[] , int x)         //time = O(log(position)) 
    {
       if (arr[0]==x)
       {
           return 0;
       }


       int i = 1;
       while (arr[i] < x)
       {
           i = i*2;
       }

       if (arr[i]==x){
           return i;
       }
        return binary_Search(arr,x ,(i/2)+1,i-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,60,80,100,200,500,1000};
        int x = 100;

        int asn = search2(arr,x);
        System.out.println(asn);

    }
}
