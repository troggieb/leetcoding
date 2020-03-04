package com.leetcoding.easy.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        int input = 123;
        int expectedOutput = 321;

        int result = objectUnderTest.reverse(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_2() {
        int input = -123;
        int expectedOutput = -321;

        int result = objectUnderTest.reverse(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_3() {
        int input = 120;
        int expectedOutput = 21;

        int result = objectUnderTest.reverse(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void example_4() {
        int input = 1534236469;
        int expectedOutput = 0;

        int result = objectUnderTest.reverse(input);

        assertEquals(expectedOutput, result);
    }

}