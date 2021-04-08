package com.algorithm.year2021.a1April.b7Eight.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/8 上午7:51
*/
public class Solution {
    /**
     * 寻找旋转排序数组中的最小值
     * 二分查找
     * @author HCY
     * @since 2021/4/8 上午7:51
     * @param nums: 翻转后的数组
     * @return int
    */
    public int findMin_1(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int n = nums.length;
        //判断数组是否为有序的
        if (nums[0] < nums[n - 1]){ return nums[0]; }
        while ( l < r ){
            int mid = (l + r) >>> 1;
            if (nums[mid] > nums[r]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }

    /**
     * 寻找旋转排序数组中的最小值
     * 暴力破解
     * @author HCY
     * @since 2021/4/8 上午8:03
     * @param nums: 翻转后的数组
     * @return int
    */
    public int findMin_2(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min){
                min = num;
            }
        }
        return min;
    }
}
