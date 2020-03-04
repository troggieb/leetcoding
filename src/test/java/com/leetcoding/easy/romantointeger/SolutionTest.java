package com.leetcoding.easy.romantointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        String input = "III";
        int expectedOutput = 3;

        int result = objectUnderTest.romanToInt(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_2() {
        String input = "IV";
        int expectedOutput = 4;

        int result = objectUnderTest.romanToInt(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_3() {
        String input = "IX";
        int expectedOutput = 9;

        int result = objectUnderTest.romanToInt(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_4() {
        String input = "LVIII";
        int expectedOutput = 58;

        int result = objectUnderTest.romanToInt(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_5() {
        String input = "MCMXCIV";
        int expectedOutput = 1994;

        int result = objectUnderTest.romanToInt(input);
        assertEquals(expectedOutput, result);
    }

}