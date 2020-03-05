package com.leetcoding.easy.validparentheses;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // this is a stack
        Stack<Character> stack = new Stack<>();
        String openers = "({[";
        String closers = ")}]";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openers.indexOf(c) >= 0) {
                stack.push(c);
            } else if (closers.indexOf(c) >= 0) {
                try {
                    char comp = stack.pop();
                    if (
                            c == ')' && comp != '(' ||
                            c == '}' && comp != '{' ||
                            c == ']' && comp != '['
                    ) {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
