package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isIt = true;
        HashMap<Character, Integer> unique = new HashMap<Character, Integer>();
        Scanner input = new Scanner(System.in);
        String test = input.next();
        for( int i =0; i < test.length(); i++) {
            Character currentChar = test.charAt(i);
            if(unique.get(currentChar)==null)
                unique.put(currentChar, 1);
            else
                isIt = false;
        }

        if(!isIt)
            System.out.println("This string is not made up of all unique characters.");
        else
            System.out.println("This string is made up of all unique characters.");
    }
}
