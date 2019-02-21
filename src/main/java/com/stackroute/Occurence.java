/* Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string*/
package com.stackroute;

public class Occurence {
    //this method will check the occurence of "a" in input string
    public int countOccurence(String str) {
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }
}

