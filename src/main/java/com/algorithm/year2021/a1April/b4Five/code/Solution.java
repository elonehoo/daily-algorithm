package com.algorithm.year2021.a1April.b4Five.code;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/5 上午8:17
*/
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);
    }
    /**
     * 合并两个有序数组
     * @author HCY
     * @since 2021/4/5 上午8:18
     * @param nums1: 数组1⃣️
     * @param m: 数组1⃣️的长度
     * @param nums2:数组2⃣️
     * @param n: 数组2⃣️的长度
     * @return void
    */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
