package com.algorithm.year2021.a1April.b6Seven.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/7 上午8:05
*/
public class Solution {
    /**
     * 搜索旋转排序数组 II
     * @author HCY
     * @since 2021/4/7 上午8:05
     * @param nums: 反转后的数组
     * @param target: 目标值
     * @return boolean
    */
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (target == num){
                return true;
            }
        }
        return false;
    }
}
