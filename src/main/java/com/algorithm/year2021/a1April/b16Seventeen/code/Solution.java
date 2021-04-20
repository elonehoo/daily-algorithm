package com.algorithm.year2021.a1April.b16Seventeen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/20 8:53 上午
*/
public class Solution {

    /**
     * 实现 strStr() 函数。
     * 对于原生API的使用
     * @author HCY
     * @since 2021/4/20 8:53 上午
     * @param haystack: haystack
     * @param needle: needle
     * @return int
    */
    public int strStr_1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 实现 strStr() 函数。
     * 暴力算法
     * @author HCY
     * @since 2021/4/20 8:55 上午
     * @param haystack: haystack
     * @param needle: needle
     * @return int
    */
    public static int strStr_2(String haystack, String needle) {
        int m = needle.length();
        if (m <= 0){ return 0; }
        int n = haystack.length();
        if (n <= 0){return -1;}
        for (int i = 0 ; (i + m) <= n ; i++){
            if (haystack.substring(i,i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
