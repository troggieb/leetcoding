package com.leetcoding.easy.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        String input = "()";

        assertTrue(objectUnderTest.isValid(input));
    }

    @Test
    public void example_2() {
        String input = "()[]{}";

        assertTrue(objectUnderTest.isValid(input));
    }

    @Test
    public void example_3() {
        String input = "(]";

        assertFalse(objectUnderTest.isValid(input));
    }

    @Test
    public void example_4() {
        String input = "([)]";

        assertFalse(objectUnderTest.isValid(input));
    }

    @Test
    public void example_5() {
        String input = "{[]}";

        assertTrue(objectUnderTest.isValid(input));
    }

    @Test
    public void example_6() {
        String input = "]";

        assertFalse(objectUnderTest.isValid(input));
    }

}