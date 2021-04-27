package com.algorithm.year2021.a1April.b23TwentyFour.code;

import java.util.regex.Matcher;

/**
 * 解决方法
 * @author HCY
 * @since 2021/4/28 7:33 上午
*/
public class Solution {
    /**
     * 平方数之和
     * 简单暴力
     * @author HCY
     * @since 2021/4/28 7:43 上午
     * @param c: 非负整数
     * @return boolean
    */
    public boolean judgeSquareSum_1(int c) {
        int max = (int) Math.sqrt(c);
        for (int a = 0 ; a <= max ; a++){
            double b = Math.sqrt(c - a * a);
            if (b == (int)b){
                return true;
            }
        }
        return false;
    }

    /**
     * 平方数之和
     * 双指针
     * @author HCY
     * @since 2021/4/28 7:47 上午
     * @param c: 非负整数
     * @return boolean
    */
    public boolean judgeSquareSum_2(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b){
            if (a * a + b * b == c){
                return true;
            }else if (a * a + b * b > c){
                b--;
            }else {
                a++;
            }
        }
        return false;
    }
}
