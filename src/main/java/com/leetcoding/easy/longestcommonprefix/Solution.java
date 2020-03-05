package com.leetcoding.easy.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) result = strs[0];
            result = getCommonPrefix(result, strs[i]);
        }
        return result;
    }

    private String getCommonPrefix(String one, String two) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < Math.min(one.length(), two.length()); i++) {
            if (one.charAt(i) == two.charAt(i)) {
                result.append(one.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
