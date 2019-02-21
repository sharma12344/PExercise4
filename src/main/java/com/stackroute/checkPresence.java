/* Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False*/
package com.stackroute;

public class checkPresence {
        // this method will check the presence of harry in input string
    boolean harry(String str) {
        return str.matches(".+\\bHarry\\b");
    }

}

