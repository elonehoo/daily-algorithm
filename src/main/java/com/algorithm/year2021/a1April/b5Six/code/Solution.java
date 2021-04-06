package com.algorithm.year2021.a1April.b5Six.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/6 下午4:47
*/
public class Solution {
    /**
     * 删除有序数组中的重复项 II
     * @author HCY
     * @since 2021/4/6 下午4:47
     * @param nums: 需要删除重复元素的数组
     * @return int
    */
    public int removeDuplicates(int[] nums) {
        return removeArr(nums,2);
    }

    private int removeArr(int[] nums, int maximum) {
        int number = 0;
        for (int num : nums) {
            if (number < maximum || nums[number - maximum] != num){
                nums[number++] = num;
            }
        }
        return number;
    }
}
