package com.algorithm.year2021.a1April.b13Fourteen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/15 下午7:05
*/
public class Solution {
    /**
     * 打家劫舍 II
     * @author HCY
     * @since 2021/4/15 下午7:05
     * @param nums: 沿街的房屋
     * @return int
    */
    public int rob(int[] nums) {
        //长度为1直接返回值
        if(nums.length == 1){
            return nums[0];
        }else{
            //处理数组[0 -> len - 2]和[len - 1 -> 1]的数组即从左到右不包括最后值的数组和从右到左不包括第一个值的数组
            int[] nums1 = new int[nums.length - 1];
            int[] nums2 = new int[nums.length - 1];
            for(int i = 0; i < nums.length - 1; ++i){
                nums1[i] = nums[i];
                nums2[i] = nums[nums.length - 1 - i];
            }
            //返回两者的最大值
            return Math.max(singleTreatment(nums1), singleTreatment(nums2));
        }
    }
    public int singleTreatment(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; ++i){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }


}
