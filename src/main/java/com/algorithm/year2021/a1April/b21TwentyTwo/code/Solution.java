package com.algorithm.year2021.a1April.b21TwentyTwo.code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/26 10:16 上午
*/
public class Solution {
    /**
     * 在 D 天内送达包裹的能力
     * 二分查找
     * @author HCY
     * @since 2021/4/26 10:16 上午
     * @param weights: 包裹的重量
     * @param D: D 天
     * @return int
    */
    public int shipWithinDays(int[] weights, int D) {
        //获取最大值
        int left = Arrays.stream(weights).max().getAsInt();
        //获取数组总和
        int right = 0;
        for (int weight : weights) {
            right += weight;
        }
        int ans = 0;
        for (; left < right ;){
            ans = (left + right) >> 1;
            int sum = 0;
            int flag = 0;
            for (int i = 0; i < weights.length; i++) {
                sum += weights[i];
                if (sum > ans) {
                    sum = weights[i];
                    flag++;
                    if(flag + 1 > D){
                        break;
                    }
                }
            }
            if (flag + 1 > D){
                left = ans + 1;
            }else {
                right = ans;
            }
        }
        return left;
    }
}
