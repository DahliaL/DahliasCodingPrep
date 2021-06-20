package com.company;

import java.util.*;

public class URLify {
    public static void main(String[] args) throws Exception {

        // Write a method to replace all spaces in a
        // string with '%20'. You may assume that the string has sufficient space
        // at the end to hold the additional characters,and that you are given
        // the "true" length of the string.
        // (Note: If implementing in Java, please use a character array so
        // that you can perform this operation in place.)

        // sample input: "Mr John Smith  "

        Scanner sc = new Scanner(System.in);
        System.out.print("Phrase: ");
        String word = sc.nextLine();
        System.out.print("Length: ");
        int len = sc.nextInt();
        char[] arr = word.toCharArray();

        // first we need the true length of the phrase without the extra spaces at the end
        int trueLen = -1;
        for(int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] != ' ') {
                trueLen = i+1;
                break;
            }
        }

        // error checking
        if(trueLen == -1)
            throw new Exception("Word has no characters");

        int spaceCount = 0, index, i = 0;
        // finding how many actual spaces there are, without considering the ending spaces
        for (i = 0; i < trueLen; i++) {
            if (arr[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLen + spaceCount * 2;

        if (trueLen < arr.length)
            arr[trueLen] = '\0';

        for (i = trueLen - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            } else {
                arr[index - 1] = arr[i];
                index--;
            }
        }

        String oof = String.valueOf(arr);
        System.out.println(oof);

    }
}
