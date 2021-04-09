package com.algorithm.year2021.a1April.b8Nine.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/9 下午7:27
*/
public class Solution {
    /**
     * 寻找旋转排序数组中的最小值 II
     * @author HCY
     * @since 2021/4/9 下午7:29
     * @param nums: 反转后的数组
     * @return int
    */
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        //判断数组是否为有序的
        while ( l < r ){
            int mid = (l + r) >>> 1;
            if (nums[mid] > nums[r]){
                l = mid + 1;
            }else if (nums[mid] < nums[r]){
                r = mid;
            }else {
                --r;
            }
        }
        return nums[l];
    }
}
