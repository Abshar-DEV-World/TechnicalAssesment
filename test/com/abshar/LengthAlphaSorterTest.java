package com.abshar;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LengthAlphaSorterTest {
        @Test
        public void testStandardArray() {
            String[] input = {"apple", "mango", "pomegranate", "pear", "avocado", "pumpkin"};
            String[] expected = {"pomegranate", "avocado", "pumpkin", "apple", "mango", "pear"};
            assertArrayEquals(expected, LengthAlphaSorter.sortWords(input));
        }

        @Test
        public void testEmptyArray() {
            String[] input = {};
            String[] expected = {};
            assertArrayEquals(expected, LengthAlphaSorter.sortWords(input));
        }

        @Test
        public void testNullArray() {
            assertArrayEquals(new String[0],LengthAlphaSorter.sortWords(null));
        }

        @Test
        public void testSameLengthAlphabetical() {
            String[] input = {"bat", "cat", "ant"};
            String[] expected = {"ant", "bat", "cat"};
            assertArrayEquals(expected, LengthAlphaSorter.sortWords(input));
        }
    }
