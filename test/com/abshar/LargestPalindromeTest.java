package com.abshar;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class LargestPalindromeTest {

    @org.testng.annotations.Test
    public void testStandardRange() {
        assertEquals(906609, LargestPalindrome.findLargestPalindromeForTest(100, 999));
    }

    @Test
    public void testSingleDigitRange() {
        assertEquals(9, LargestPalindrome.findLargestPalindromeForTest(1, 9));
    }

    @Test
    public void testNoPalindrome() {
        assertEquals(0, LargestPalindrome.findLargestPalindromeForTest(10, 10));
    }

    @Test
    public void testInvalidRange() {
        assertEquals(-1, LargestPalindrome.findLargestPalindromeForTest(200, 100));
    }
}