package com.abshar;
import java.util.Arrays;
import java.util.Comparator;

public class LengthAlphaSorter {

        public static void main(String[] args) {
            String[] words = {"apple", "mango", "pomegranate", "pear", "avocado", "pumpkin"};

            String[] sorted = sortWords(words);

            System.out.println("Sorted words:");
            for (String word : sorted) {
                System.out.println(word);
            }
        }

        public static String[] sortWords(String[] words) {
            if (words == null) return new String[0];

            String[] copy = Arrays.copyOf(words, words.length);

            Arrays.sort(copy, Comparator
                    .comparingInt(String::length).reversed() // longest first
                    .thenComparing(Comparator.naturalOrder()) // alphabetical
            );

            return copy;
        }
    }

