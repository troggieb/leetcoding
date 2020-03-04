package com.leetcoding.easy.palindromenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        int input = 121;

        assertTrue(objectUnderTest.isPalindrome(input));
    }

    @Test
    public void example_2() {
        int input = -121;

        assertFalse(objectUnderTest.isPalindrome(input));
    }

    @Test
    public void example_3() {
        int input = 10;

        assertFalse(objectUnderTest.isPalindrome(input));
    }

}