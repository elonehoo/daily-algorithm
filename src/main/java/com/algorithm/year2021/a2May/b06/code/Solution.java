package com.algorithm.year2021.a2May.b06.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/6 1:22 下午
*/
public class Solution {
    /**
     *
     * @author HCY
     * @since 2021/5/6 1:22 下午
     * @param encoded:另一个整数数组
     * @param first:
     * @return int[]
    */
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}
