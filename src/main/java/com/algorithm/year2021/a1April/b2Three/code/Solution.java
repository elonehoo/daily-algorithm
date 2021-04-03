package com.algorithm.year2021.a1April.b2Three.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/3 下午5:48
*/
public class Solution {
    /**
     * 最长公共子序列
     * @author HCY
     * @since 2021/4/3 下午5:48
     * @param text1: 公共子序列
     * @param text2: 公共子序列
     * @return int
    */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new  int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }
}
