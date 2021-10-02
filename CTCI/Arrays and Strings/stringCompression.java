package com.company;

import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) throws Exception {
        /*
        * String Compression: Implement a method to perform basic string compression
        * using the counts of repeated characters. For example,
        * the string aabcccccaaa would become a2blc5a3.
        * If the "compressed" string would not become smaller than the original string,
        * your method should return the original string.
        * You can assume the string has only uppercase and lowercase letters (a - z).
        * */

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder fin = new StringBuilder();

        int count = 0;
        char temp = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == temp)
                count++;
            else {
                fin.append(temp);
                fin.append(count);
                temp = s.charAt(i);
                count = 1;
            }
        }

        fin.append(temp);
        fin.append(count);

        if(fin.length() >= s.length())
            System.out.println(s);
        else
            System.out.println(fin.toString());
    }
}
