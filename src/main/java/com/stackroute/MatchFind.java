/* Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
Input : She sells seashells by the seashore
Given word: se
Output :
Found at: 4 - 6
Found at: 10 - 12
Found at: 27 – 29*/
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFind {

    public String findIndex(String str, String input) {
        Pattern pt = Pattern.compile(input);
        Matcher matcher = pt.matcher(str);
        String res = "";
        while (matcher.find()) {
            res = res + matcher.start() + "-" + matcher.end() + " ";
        }
        return res.trim();
    }
}

