package com.algorithm.year2021.march.a4twentyNine.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/3/29 下午10:11
*/
public class Solution {
    /**
     * 反转二进制
     * @author HCY
     * @since 2021/3/29 下午10:12
     * @param n: 您需要将n视为无符号值(31)
     * @return int
    */
    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0 ; i <= 31 ; i++){
            a = a + ( (1 & ( n >> i ) ) << ( 31 - i ) );
        }
        return a;
    }
}
