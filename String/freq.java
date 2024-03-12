package String;
// String is a sequence of characters. In java, objects of String are immutable which means a constant
// and cannot be changed once created.

//There are two ways to create string in Java:
//  String literal
//  String s = “GeeksforGeeks”;
//  or
//  Using new keyword
//  String s = new String (“GeeksforGeeks”);


//print frequencies of character(in sorted oeder)in a string of lower alphabet.
//i/p : "geeksforgeeks"
//o/p : e - 4
//      f - 1
//      g - 2
//      so on
public class freq {
    public static void main(String[] args) {          //time : O(n)
        String str = "geeksforgeeks";
        int count[] = new int[26];      //initilize count array with 0
        for (int i=0 ; i<str.length() ; i++)
        {
            count[str.charAt(i) - 'a']++;
        }
        for (int i=0 ; i<26 ; i++){
            if (count[i]>0)
            {
                System.out.println((char)(i+'a') + "-" + count[i]);
            }
        }
    }
}
