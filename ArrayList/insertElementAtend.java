package ArrayList;
import java.util.ArrayList;
public class insertElementAtend {
     void add_at_end(int[] arr, int x){
         int n  = arr.length;        //here 5
         arr[n-1] = x;
    }
    public static void main(String[] args) {
        insertElementAtend i = new insertElementAtend();

        //idk it is fixed size or dynamic size but most probably it is daynamic sized array
        //int arr1[] = new int[] {4,7,9,6};


        //fixed size array
        int arr[] = new int[5];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 6;

        int x = 8;
        i.add_at_end(arr , x );

        for(int j=0; j < arr.length; j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
