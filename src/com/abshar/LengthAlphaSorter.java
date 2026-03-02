package com.abshar;
import java.util.Arrays;
import java.util.Comparator;

public class LengthAlphaSorter {

        public static void main(String[] args) {
            // Sample input array
            String[] words = {"apple", "mango", "pomegranate", "pear", "avocado", "pumpkin"};
                
            // Call sorting method
            String[] sorted = sortWords(words);

            // Print sorted result
            System.out.println("Sorted words:");
            for (String word : sorted) {
                System.out.println(word);
            }
        }

        public static String[] sortWords(String[] words) {
       // Returning empty array avoids NullPointerException
            if (words == null) return new String[0];
                
      // Create a copy to preserve immutability of original array
            String[] copy = Arrays.copyOf(words, words.length);

            Arrays.sort(copy, Comparator
                    .comparingInt(String::length).reversed() // longest first
                    .thenComparing(Comparator.naturalOrder()) // alphabetical
            );

            return copy;
        }
    }

