package com.algorithm.year2021.march.a5ThirtyOne.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/3/31 下午2:58
*/
public class Solution {
    /**
     * 在集合中找子集
     * @author HCY
     * @since 2021/3/31 下午3:19
     * @param nums: 整数集合
     * @return java.util.List<java.util.List<java.lang.Integer>>
    */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        if(nums == null || nums.length == 0) {
            return resultList;
        }
        Arrays.sort(nums);


        List<Integer> templeList = new ArrayList<>();
        templeList.add(nums[0]);
        resultList.add(templeList);
        if(nums.length == 1) {
            return resultList;
        }

        int lastLen = 1;

        for(int i = 1; i < nums.length; i++){
            int size = resultList.size();
            if(nums[i] != nums[i-1]){
                lastLen = size;
            }

            for(int j = size - lastLen; j < size; j++){
                List<Integer> inner = new ArrayList(resultList.get(j));
                inner.add(nums[i]);
                resultList.add(inner);
            }
        }
        return resultList;
    }
}
