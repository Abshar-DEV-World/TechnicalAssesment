package com.abshar;

public class LargestPalindrome {

    public static void main(String[] args) {
        // Find the largest palindrome for 3-digit numbers
        int result = findLargestPalindrome(100, 999);
        
        // If no palindrome found (invalid range or no valid product)
        if (result == 0) {
            System.out.println("No palindrome found in given range.");
        }
    }

    public static int findLargestPalindrome(int min, int max) {

        // Validate input range
        if (min < 0 || max < 0 || min > max) {
            System.out.println("Invalid input range provided.");
            return 0;
        }

        int largestPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;

        // Loop from max to min to find largest palindrome quickly
        for (int i = max; i >= min; i--) {
            for (int j = i; j >= min; j--) { // Avoid duplicate checks
                int product = i * j;
                
                // Optimization to reduce unnecessary iterations
                if (product <= largestPalindrome) break; 

                if (isPalindrome(product)) {
                    largestPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        if (largestPalindrome > 0) {
            System.out.println("Largest Palindrome: " + largestPalindrome);
            System.out.println("Factors: " + factor1 + " x " + factor2);
        }

        return largestPalindrome;
    }

    public static int findLargestPalindromeForTest(int min, int max) {
        if (min < 0 || max < 0 || min > max) return -1;

        int largestPalindrome = 0;
        for (int i = max; i >= min; i--) {
            for (int j = i; j >= min; j--) {
                int product = i * j;
                if (product <= largestPalindrome) break;
                if (isPalindrome(product)) largestPalindrome = product;
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        // Reverse using StringBuilder
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
