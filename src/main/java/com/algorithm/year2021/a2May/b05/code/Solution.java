package com.algorithm.year2021.a2May.b05.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/5 4:15 下午
*/
public class Solution {

    int[] cnts = new int[10009];

    /**
     * 删除并获得点数
     * @author HCY
     * @since 2021/5/5 4:15 下午
     * @param nums: 整数数组
     * @return int
    */
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int x : nums) {
            cnts[x]++;
            max = Math.max(max, x);
        }
        // f[i][0] 代表「不选」数值 i；f[i][1] 代表「选择」数值 i
        int[][] f = new int[max + 1][2];
        for (int i = 1; i <= max; i++) {
            f[i][1] = f[i - 1][0] + i * cnts[i];
            f[i][0] = Math.max(f[i - 1][1], f[i - 1][0]);
        }
        return Math.max(f[max][0], f[max][1]);
    }
}
