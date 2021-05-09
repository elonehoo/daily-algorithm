package com.algorithm.year2021.a2May.b09.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/9 10:00 上午
*/
public class Solution {
    /**
     * 制作 m 束花所需的最少天数
     * @author HCY
     * @since 2021/5/9 10:00 上午
     * @param bloomDay: 花园中有 n 朵花，第 i 朵花会在 bloomDay[i] 时盛开，恰好 可以用于 一束 花中。
     * @param m: 需要制作 m 束花
     * @param k: 使用花园中 相邻的 k 朵花 。
     * @return int
    */
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length){
            return -1;
        }
        //这里最大的等待天数就是数组中的最大值
        int max = 0;
        for (int i : bloomDay) {
            max = Math.max(max,i);
        }
        int min = 0;
        while (min < max){
            int mid = min + ((max - min) / 2);
            if (getCount(bloomDay,mid,k) >= m) {
                max = mid;
            } else {
                min = mid+1;
            }

        }
        return min;
    }

    /**
     * 返回等待day天，有多少组连续的k天<=day
     * 这里用的贪心
     * @author HCY
     * @since 2021/5/9 10:37 上午
     * @param arr:
     * @param day:
     * @param k:
     * @return int
    */
    private int getCount(int[] arr, int day, int k) {
        int result=0;
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                count = 0;
            }
            //  连续的k朵花🌼开了
            if (count == k) {
                result++;
                count=0;
            }
        }
        return result;
    }
}
