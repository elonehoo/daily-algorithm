package com.algorithm.year2021.a1April.b0One.code;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/1 下午7:14
 */
public class Solution {

    /**
     * 计算笨阶乘
     * @author HCY
     * @since 2021/4/1 下午7:14
     * @param N: 数字
     * @return int
     */
    public static int clumsy(int N) {
        if (N <= 2){ return N; }
        if (N <= 4){ return N + 3; }
        if (N % 4 == 0){ return N + 1; }
        if (N % 4 == 3){return  N - 1; }
        return N + 2;
    }

}
