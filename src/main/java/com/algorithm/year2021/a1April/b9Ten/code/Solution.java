package com.algorithm.year2021.a1April.b9Ten.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/10 下午8:48
*/
public class Solution {
    /**
     * 丑数
     * @author HCY
     * @since 2021/4/10 下午8:48
     * @param n: 数字
     * @return boolean
    */
    public boolean isUgly(int n) {
        if ( n <= 0 ){ return false; }
        while (n % 2 ==0){ n /= 2; }
        while (n % 3 ==0){ n /= 3; }
        while (n % 5 ==0){ n /= 5; }
        return n == 1;
    }
}
