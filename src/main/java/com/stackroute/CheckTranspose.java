/* Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a kciuq nworb xof spmuj revo eht yzal god*/

package com.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckTranspose {
    public String outTranspose(String str) {
        // this method trasposes the input string
        String[] out = str.split(" ");
        String res = "";
        for (int i = 0; i < out.length; i++) {
            List<String> str2 = Arrays.asList(out[i].split(""));
            Collections.reverse(str2);
            res = res + String.join("", str2) + " ";
        }
        return res.trim();
    }

}
