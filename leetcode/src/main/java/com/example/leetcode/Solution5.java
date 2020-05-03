package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/05/03 14:34
 * @version: V1.0
 */
public class Solution5 {

    public String longestPalindrome(String s) {
        if("".equals(s)){
            return "";
        }
        String reverse = new StringBuffer(s).reverse().toString();
        int maxLength = 0;
        int end = 0;
        int aa[][] = new int[s.length()][s.length()];
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < reverse.length() ; j++) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        aa[i][j] = 1;
                    } else {
                        System.out.println(i + ":" + j);
                        aa[i][j] = aa[i - 1][j - 1] + 1;
                    }

                }
                if (aa[i][j] > maxLength) {
                    maxLength = aa[i][j];
                    end = i;
                }
            }

        }
        return s.substring(end - maxLength + 1, end + 1);
    }
}
