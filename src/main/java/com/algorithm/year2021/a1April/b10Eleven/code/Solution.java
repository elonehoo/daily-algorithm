package com.algorithm.year2021.a1April.b10Eleven.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/11 下午8:51
*/
public class Solution {
    /**
     * 丑数II
     * @author HCY
     * @since 2021/4/11 下午8:51
     * @param n: 丑数
     * @return int
    */
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i]=Math.min(arr[a]*2,Math.min(arr[b]*3,arr[c]*5));
            if(arr[i]==arr[a]*2){a++;}
            if(arr[i]==arr[b]*3){b++;}
            if(arr[i]==arr[c]*5){c++;}
        }
        return arr[n];
    }
}
