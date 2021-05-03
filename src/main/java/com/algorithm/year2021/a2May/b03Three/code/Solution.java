package com.algorithm.year2021.a2May.b03Three.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/3 9:30 上午
*/
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            if ( result > 214748364 || result < -214748364 ){
                return 0;
            }
            result = ( result * 10 ) + (x % 10);
            x = x / 10;
        }
        return result;
    }
}
