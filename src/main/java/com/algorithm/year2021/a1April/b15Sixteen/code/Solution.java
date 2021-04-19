package com.algorithm.year2021.a1April.b15Sixteen.code;
/**
 * 解决方案
 * @author HCY
 * @since 2021/4/19 10:03 下午
*/
public class Solution {
    /**
     *
     * @author HCY
     * @since 2021/4/19 10:03 下午
     * @param nums: 数组
     * @param val: 删除的值
     * @return int
    */
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int num : nums) {
            if (num != val){
                nums[j++] = num;
            }
        }
        return j++;
    }
}
