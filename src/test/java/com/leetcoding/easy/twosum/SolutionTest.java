package com.leetcoding.easy.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution objectUnderTest = new Solution();

    @Test
    public void example_01() {
        int[] givenNums = {2, 7, 11, 15};
        int target = 9;

        int[] expectedResult = {0, 1};
        int[] result = objectUnderTest.twoSum(givenNums, target);

        assertArrayEquals(expectedResult, result);
    }

}