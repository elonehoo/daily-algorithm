package com.algorithm.year2021.a1April.b18Nineteen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/22 9:59 上午
*/
public class Solution {


    /**
     * 矩形区域不超过 K 的最大数值和
     * @author HCY
     * @since 2021/4/22 9:59 上午
     * @param matrix: m x n 的矩阵
     * @param k: 整数 k
     * @return int
    */
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length, max = Integer.MIN_VALUE;
        // O(cols ^ 2 * rows)
        // 枚举左边界
        for (int l = 0; l < cols; l++) {
            // 左边界改变才算区域的重新开始
            int[] rowSum = new int[rows];
            // 枚举右边界
            for (int r = l; r < cols; r++) {
                // 按每一行累计到 dp
                for (int i = 0; i < rows; i++) {
                    rowSum[i] += matrix[i][r];
                }

                // 求 rowSum 连续子数组 的 和
                // 和 尽量大，但不大于 k
                max = Math.max(max, dpmax(rowSum, k));
            }
        }
        return max;

    }

    private int dpmax(int[] rowSum, int k) {
        int rollSum = rowSum[0], rollMax = rollSum;
        // O(rows)
        for (int i = 1; i < rowSum.length; i++) {
            if (rollSum > 0) {
                rollSum += rowSum[i];
            } else {
                rollSum = rowSum[i];
            }
            if (rollSum > rollMax) {
                rollMax = rollSum;
            }
        }
        if (rollMax <= k) {
            return rollMax;
        }
        // O(rows ^ 2)
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < rowSum.length; l++) {
            int sum = 0;
            for (int r = l; r < rowSum.length; r++) {
                sum += rowSum[r];
                if (sum > max && sum <= k) {
                    max = sum;
                }
                // 尽量提前
                if (max == k) {
                    return k;
                }
            }
        }
        return max;

    }
}
