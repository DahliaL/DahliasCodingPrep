package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class palinPerm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        // getting rid of spaces and uppercase letters
        phrase = phrase.replace(" ", "");
        phrase = phrase.toLowerCase();

        boolean single = false;

        // char array and sorting the array
        char[] temp = phrase.toCharArray();
        Arrays.sort(temp);

        // checking if the phrase is even or odd...
        boolean odd = true;

        if( phrase.length()%2 == 0)
            odd = false;

        // end result
        boolean palin = true;

        // since the array is sorted, i am going through and checking if there a duplicate letter in the phrase
        // if there isn't, that is okay.... but the phrase must be odd length and it needs to be the only single letter in the phrase
        for(int i=0; i < temp.length-1; i+=2) {
            if(temp[i] == temp[i+1])
                continue;
            else if(odd && !single)
                single = true;
            else {
                palin = false;
                break;
            }
        }

        System.out.println(palin);
    }
}
