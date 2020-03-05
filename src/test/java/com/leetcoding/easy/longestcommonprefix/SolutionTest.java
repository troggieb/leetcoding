package com.leetcoding.easy.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        String[] input = {"flower", "flow", "flight"};
        String expectedOutput = "fl";

        String result = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_2() {
        String[] input = {"dog","racecar","car"};
        String expectedOutput = "";

        String result = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_3() {
        String[] input = {"a"};
        String expectedOutput = "a";

        String result = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_4() {
        String[] input = {"aa", "a"};
        String expectedOutput = "a";

        String result = objectUnderTest.longestCommonPrefix(input);

        assertEquals(expectedOutput, result);
    }

}