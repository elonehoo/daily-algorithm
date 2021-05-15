package com.algorithm.year2021.a2May.b13.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/15 7:31 下午
*/
public class Solution {

    private char[] chars = {'I','V','X','L','C','D','M'};
    private int[] nums = {1,5,10,50,100,500,1000};

    public int romanToInt(String s) {
        int sum = 0;
        int preNum = romanOneToInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int sufNum = romanOneToInt(s.charAt(i));
            if (preNum < sufNum){
                sum -= preNum;
            }else {
                sum += preNum;
            }
            preNum = sufNum;
        }
        sum += preNum;
        return sum;
    }

    private int romanOneToInt(char value) {
        for (int i = 0; i < chars.length; i++) {
            if (value == chars[i]){
                return nums[i];
            }
        }
        return 0;
    }
}
