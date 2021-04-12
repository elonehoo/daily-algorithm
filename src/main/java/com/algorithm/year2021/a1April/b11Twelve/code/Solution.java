package com.algorithm.year2021.a1April.b11Twelve.code;

import java.util.Arrays;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/12 下午9:49
*/
public class Solution {
    /**
     * 最大数
     * @author HCY
     * @since 2021/4/12 下午9:50
     * @param nums: 非负整数
     * @return java.lang.String
    */
    public String largestNumber(int[] nums) {
        //初始化字符串数组
        String[] strings= new String[nums.length];
        //填充字符串
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings,(a, b)->{
            return (b + a).compareTo(a+b);
        });
        if("0".equals(strings[0])){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length ; i++){
            sb.append(strings[i]);
        }
        return sb.toString();

    }
}
