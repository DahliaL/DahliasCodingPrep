package com.company;

import java.util.Scanner;
import java.util.HashMap;

public class checkPermutation {
        public static void main(String[] args) {

        // Check Permutation: Given two strings,write a method to decide if one is a permutation of the
            //other.

            Scanner sc = new Scanner(System.in);

            System.out.print("First word?: ");
            String word1 = sc.next();
            System.out.print("Second word?: ");
            String word2 = sc.next();

            HashMap<Character, Integer> stored = new HashMap<>();

            boolean not = true;

            if(word1.length() != word2.length()) {
                not = false;
            }


            for(int i = 0; i < word1.length(); i++) {
                if(!not) // the word lengths are diff, don't even bother
                    break;

                if(stored.get(word1.charAt(i))==null)
                    stored.put(word1.charAt(i), 1);
                else
                    stored.put(word1.charAt(i), stored.get(word1.charAt(i))+1);
            }

            for(int i = 0; i < word2.length(); i++) {
                if(!not) // same idea
                    break;
                Character curr = word2.charAt(i);
                if(stored.get(curr) > 0)
                    stored.put(curr, stored.get(curr)-1);
                else if(stored.get(curr) == 0 ) //in this case, that character cannot be used again since it's at zero already...
                    not = false;
                else if( stored.get(curr) == null ) // in this case, the character doesn't even exist in the other word...
                    not = false;
            }

            System.out.print(not);
        }

    }


