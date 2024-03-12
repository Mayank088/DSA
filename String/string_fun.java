package String;

//String Methods
//int length(): Returns the number of characters in the String.
//"GeeksforGeeks".length();  // returns 13

//Char charAt(int i): Returns the character at ith index.
//"GeeksforGeeks".charAt(3); // returns  ‘k’

//String substring (int i): Return the substring from the ith  index character to end.
//"GeeksforGeeks".substring(3); // returns “ksforGeeks”

//String substring (int i, int j): Returns the substring from i to j-1 index.
// "GeeksforGeeks".substring(2, 5); // returns “eks”

//String concat( String str): Concatenates specified string to the end of this string.
// String s1 = ”Geeks”;
// String s2 = ”forGeeks”;
// String output = s1.concat(s2); // returns “GeeksforGeeks”

//int indexOf (String s): Returns the index within the string of the first occurrence of the specified string.
// String s = ”Learn Share Learn”;
// int output = s.indexOf(“Share”); // returns 6

//int indexOf (String s, int i): Returns the index within the string of the first occurrence of the
// specified string, starting at the specified index.
// String s = ”Learn Share Learn”;
// int output = s.indexOf(‘a’,3);// returns 8

//Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the
// specified string.
// String s = ”Learn Share Learn”;
// int output = s.lastIndexOf(‘a’); // returns 14
//
//boolean equals( Object otherObj): Compares this string to the specified object.
// Boolean out = “Geeks”.equals(“Geeks”); // returns true
// Boolean out = “Geeks”.equals(“geeks”); // returns false
//
//boolean  equalsIgnoreCase (String anotherString): Compares string to another string,
// ignoring case considerations.
// Boolean out= “Geeks”.equalsIgnoreCase(“Geeks”); // returns true
// Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true

// int compareTo( String anotherString): Compares two string lexicographically.
// int out = s1.compareTo(s2);  // where s1 ans s2 are
//                             // strings to be compared
//
// This returns difference s1-s2. If :
// out < 0  // s1 comes before s2
// out = 0  // s1 and s2 are equal.
// out > 0   // s1 comes after s2.

//int compareToIgnoreCase( String anotherString): Compares two string lexicographically,
// ignoring case considerations.
// int out = s1.compareToIgnoreCase(s2);
//// where s1 ans s2 are
//// strings to be compared
//
// This returns difference s1-s2. If :
// out < 0  // s1 comes before s2
// out = 0   // s1 and s2 are equal.
// out > 0   // s1 comes after s2.
//
//Note- In this case, it will not consider case of a letter (it will ignore whether it is uppercase or lowercase).
//String toLowerCase(): Converts all the characters in the String to lower case.
//String word1 = “HeLLo”;
//String word3 = word1.toLowerCase(); // returns “hello"

//String toUpperCase(): Converts all the characters in the String to upper case.
//String word1 = “HeLLo”;
//String word2 = word1.toUpperCase(); // returns “HELLO”

//String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
//String word1 = “ Learn Share Learn “;
//String word2 = word1.trim(); // returns “Learn Share Learn”

// String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
//String s1 = “feeksforfeeks“;
//String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”
public class string_fun {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        //String s1 = new String("geeksforgeeks");

        System.out.println("String : "+s);

        // 1 - Returns the length
        System.out.println("1. String length : " + s.length());

        //2 - Returns the character at ith index.
        System.out.println("2. character at 3rd index :" + s.charAt(3));

        //3 - Return the substring from the ith index character to end of string.
        System.out.println("3. Substring : " + s.substring(3));

        //4 - Returns the substring from i to j-1 index.
        System.out.println("4. Substring : " + s.substring(2,5));

        //5 -  Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("5. Concatenated string : "+s1.concat(s2));

        //6 - Returns the index within the string (S ni index aapse)
        String s3 = "Learn Share Learn";
        System.out.println("6. Index of Share : " + s3.indexOf("Share"));

        //7 -  Returns the index within the string of the first occurrence of the specified string
        // starting at the specified index.
        System.out.println("7. Index of a = " + s3.indexOf('a',3));

        //8 - Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("8. Checking Equality Geeks = geeks : " + out);

        out = "Geeks".equals("Geeks");
        System.out.println("8. Checking Equality Geeks = Geeks : " + out);

        //9 - Checking equals IgnoreCase
        out = "Geeks".equalsIgnoreCase("geEKS ");
        System.out.println("9. Checking Equality ingonre case Geeks = geEKS :  " + out);

        //10 - compareTo
        int out1 = s1.compareTo(s2);
        System.out.println("10. If s1 = s2 " + out1);

        //11 - Converting cases
        String word1 = "GeeKyMe";
        System.out.println("11. Changing GeeKyMe to lower Case : " + word1.toLowerCase());

        //11 -  Converting cases
        String word2 = "GeekyME";
        System.out.println("11. Changing GeeKyMe to Upper Case :  " + word1.toUpperCase());

        //12 - Trimming the word
        String word4 = "    Learn Share Learn ";
        System.out.println("12. Trim the (     Learn Share Learn  ) : " + word4.trim());

        //13 - Replacing characters
        String str1 = "geeksforfeeks".replace('g' ,'f') ;
        System.out.println("13. Replaced f with g -> " + str1);
    }
}
