/* Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry*/
package com.stackroute;

public class ReplaceChar {
    public String replaceChar(String str) {


        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        // Replace all the 'l' characters with 't' characters.
        String new_str1 = new_str.replace('l', 't');


        return new_str1;
    }
}

