package com.algorithm.year2021.a1April.b19Twenty.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/23 3:19 下午
*/
public class Solution {

    /**
     * 暴力回溯+dfs
     * @author HCY
     * @since 2021/4/23 5:34 下午
    */
    public static ArrayList<Integer> result;
    public static List<Integer> list;


    /**
     * 最大整除子集
     * 暴力回溯+dfs
     * @author HCY
     * @since 2021/4/23 3:19 下午
     * @param nums: 正整数组成的集合
     * @return List<Integer>
    */
    public static List<Integer> largestDivisibleSubset_1(int[] nums) {
        result = new ArrayList<>();
        list = new ArrayList<>();
        dfs(nums,0);
        return result;
    }

    /**
     * dfs算法
     * @author HCY
     * @since 2021/4/23 5:28 下午
     * @param nums: 正整数组成的集合
     * @param index: 位置
     * @return void
    */
    private static void dfs(int[] nums, int index) {
        //如果当前temp中的元素加上后续还未遍历的元素仍然小于当前ans中的元素个数，则没必要往下遍历了，直接返回
        if (nums.length - index + list.size() < result.size()){
            return;
        }
        //如果遍历到数组末尾，如果temp中的元素个数大于ans，则更新ans
        if (index == nums.length){
            if (list.size() > result.size()){
                result.removeAll(result);
                result.addAll(list);
            }
            return;
        }
        if (list.size() == 0){
            list.add(nums[index]);
            dfs(nums,index + 1);
            list.remove(list.size() - 1);
            dfs(nums,index + 1);
        } else {
            boolean right = true;
            for (Integer integer : list) {
                if (nums[index] % integer != 0 && integer % nums[index] != 0){
                    right = false;
                    break;
                }
            }
            if (right){
                list.add(nums[index]);
                dfs(nums,index + 1);
                list.remove(list.size() - 1);
                dfs(nums,index + 1);
            }else {
                dfs(nums,index + 1);
            }
        }
    }

    /**
     * 最大整除子集
     * 动态规划DP
     * @author HCY
     * @since 2021/4/23 5:31 下午
     * @param nums: 正整数组成的集合
     * @return java.util.List<java.lang.Integer>
    */
    public static List<Integer> largestDivisibleSubset_2(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int[] f = new int[n];
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            // 至少包含自身一个数，因此起始长度为 1，由自身转移而来
            int len = 1, prev = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    // 如果能接在更长的序列后面，则更新「最大长度」&「从何转移而来」
                    if (f[j] + 1 > len) {
                        len = f[j] + 1;
                        prev = j;
                    }
                }
            }
            // 记录「最终长度」&「从何转移而来」
            f[i] = len;
            g[i] = prev;
        }

        // 遍历所有的 f[i]，取得「最大长度」和「对应下标」
        int max = -1, idx = -1;
        for (int i = 0; i < n; i++) {
            if (f[i] > max) {
                idx = i;
                max = f[i];
            }
        }

        // 使用 g[] 数组回溯出具体方案
        List<Integer> ans = new ArrayList<>();
        while (ans.size() != max) {
            ans.add(nums[idx]);
            idx = g[idx];
        }
        return ans;
    }
}
