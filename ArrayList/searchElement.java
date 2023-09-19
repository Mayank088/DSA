package ArrayList;

//search element in unsorted array
public class searchElement {
    int search(int arr[] , int x ){
        int n = arr.length;
        for (int i=0; i<n ; i++)      //time complexity = O(n)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        searchElement s = new searchElement();
        int arr[] = {4,6,8,3,1};
        int ans = s.search(arr , 8);
        System.out.println(ans);
    }
}
