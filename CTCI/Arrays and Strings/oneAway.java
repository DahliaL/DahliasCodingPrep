package com.company;

import java.util.Scanner;

public class oneAway {
    public static boolean oneAwayy(String w1, String w2) {

        if(Math.abs(w1.length()-w2.length()) > 1 )
            return false;

        boolean madeEdit = false;
        int p1 = 0;
        int p2 = 0;

        while (p1 < w1.length() && p2 < w2.length()) {
            if(w1.charAt(p1) == w2.charAt(p2)) {
                // keep moving..
                p1 += 1;
                p2 += 1; }
            else if (!madeEdit) {
                // mimic making an edit
                madeEdit = true;
                // if the lengths are the same, we mimic making an edit to one of the strings, and move on
                if(w1.length() == w2.length()) {
                    p1 += 1;
                    p2 += 1; }
                else if(w1.length() < w2.length())  // if string2 is longer, we "delete" a character there, and go to the next character
                    p2 += 1;
                else if(w1.length() > w2.length()) // same idea but for string 1
                    p1 += 1; }
            else // an edit has been made already and so this wouldn't be "one away"
                    return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        /*
        * One Away: There are three types of edits that can be performed on strings:
        * insert a character, remove a character, or replace a character.
        * Given two strings, write a function to check if they are one edit (or zero edits) away.
        * */
        boolean temp = false;

        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        System.out.println(oneAwayy(word1, word2));

    }

}
