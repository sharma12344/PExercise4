/* Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/

package com.stackroute;

import java.util.*;

public class SortPara {
    public String[] operations(String s) {

        String arr[] = new String[8];
        int c = 0;


        {
            StringTokenizer st = new StringTokenizer(s, " ");

            while (st.hasMoreTokens()) {
                arr[c] = st.nextToken();
                c++;
            }
            System.out.println("The original string is:::" + s);
            System.out.println("-------The Tokens of the strings--------");
            for (int i = 0; i < c; i++) {
                System.out.println(arr[i]);
            }
        }

        {

            {


                for (int i = 0; i < c; i++) {
                    for (int j = i + 1; j < c; j++) {
                        if (arr[j].compareToIgnoreCase(arr[i]) < 0) {
                            String t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }
                    }
                }
            }
            System.out.println("--------The sorted array of strings---------");
            for (int k = 0; k < c; k++) {
                System.out.println(arr[k]);
            }
        }
        return arr;

    }


}

