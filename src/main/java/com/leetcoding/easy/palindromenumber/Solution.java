package com.leetcoding.easy.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return reverse(x) == x;
    }

    private int reverse(int x) {
        // Used for isPalindrome will overflow
        int output = 0;

        while (x != 0) {
            output *= 10;
            output += x % 10;
            x /= 10;
        }
        return output;
    }
}
