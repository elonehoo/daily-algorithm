package com.algorithm.year2021.a1April.b6Seven.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/7 上午8:05
*/
public class Solution {
    /**
     * 搜索旋转排序数组 II
     * 暴力破解法
     * @author HCY
     * @since 2021/4/7 上午8:05
     * @param nums: 反转后的数组
     * @param target: 目标值
     * @return boolean
    */
    public boolean search_1(int[] nums, int target) {
        for (int num : nums) {
            if (target == num){
                return true;
            }
        }
        return false;
    }

    /**
     * 搜索旋转排序数组 II
     * 二分查找
     * @author HCY
     * @since 2021/4/7 下午1:28
     * @param nums: 反转后的数组
     * @param target: 目标值
     * @return boolean
    */
    public boolean search_2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            //将重复的数字进行处理
            while (l < r && nums[l] == nums[l + 1]){ ++l; }
            while (l < r && nums[r] == nums[r - 1]){ --r; }
            //找到中间的数值
            int mid = l + (r - l) / 2;
            if (nums[mid] == target){ return true; }
            //二分查找
            if (nums[mid] >= nums[l]){
                //左边是有序的
                if (target < nums[mid] && target >= nums[l]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else {
                //右边也是有序的
                if (target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

    /**
     * 搜索旋转排序数组 II
     * 递归 + 二分查找
     * @author HCY
     * @since 2021/4/7 下午1:48
     * @param nums: 反转后的数组
     * @param target: 目标值
     * @return boolean
    */
    public boolean search(int[] nums, int target) {
        return this.binary(nums,target,0,nums.length - 1);
    }

    public boolean binary(int[] nums, int target, int state, int over) {
        //判断数组是否存在
        if (state > over){ return false; }
        //如果数组长度为1，判断唯一的数值和目标值是否相等
        if (state == over){
            return nums[state] == target;
        }
        //寻找中间值
        int mid = (over - state) / 2 + state;
        //判断中间值是否跟目标值相等
        if(nums[mid] == target){
            return true;
        }else {
            //查找左边的
            if (state != mid && nums[state] >= nums[mid]){
                if (nums[state] == nums[mid]){
                    return this.binary(nums,target,state,mid)
                           || this.binary(nums,target,mid + 1,over);
                }else if (nums[mid + 1] <= target && target <= nums[over]){
                    return this.binary(nums,target,mid + 1,over);
                }else {
                    return this.binary(nums,target,state,mid);
                }
            }else {
                if (nums[state] == nums[mid]){
                    return this.binary(nums,target,state,mid)
                           || this.binary(nums,target,mid + 1,over);
                }else if (nums[state] <= target && nums[mid] >= target){
                    return this.binary(nums,target,state,mid);

                }else {
                    return this.binary(nums,target,mid + 1, over);
                }
            }
        }
    }
}
