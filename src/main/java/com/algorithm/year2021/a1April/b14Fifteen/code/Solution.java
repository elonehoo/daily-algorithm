package com.algorithm.year2021.a1April.b14Fifteen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/18 12:20 下午
*/
public class Solution {
    /**
     * 删除有序数组中的重复项
     * 双指针
     * @author HCY
     * @since 2021/4/18 12:20 下午
     * @param nums: 有序数组
     * @return int
    */
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
