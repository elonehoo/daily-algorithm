package com.algorithm.year2021.a1April.b17Eighteen.code;

import java.util.Arrays;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/21 6:53 上午
*/
public class Solution {
    /**
     * 解码方法
     * 递归算法
     * @author HCY
     * @since 2021/4/21 11:11 上午
     * @param s:
     * @return int
    */
    public static int numDecodings_2(String s) {
        int[] map = new int[s.length()];
        Arrays.fill(map,-1);
        return recursive(s.toCharArray(),s.length(),0,map);
    }

    private static int recursive(char[] chars, int length, int index, int[] map) {
        if (index >= length) {
            return 1;
        }
        if (chars[index] == '0') {
            return 0;
        }
        //先从map中取，如果有就直接取出，如果没有在计算
        if (map[index] != -1) {
            return map[index];
        }
        int res = recursive(chars, length, index + 1, map);
        if (index < length - 1 && (chars[index] == '1' || chars[index] == '2' && chars[index + 1] <= '6')) {
            res += recursive(chars, length, index + 2, map);
        }
        //把计算的结果在存储到map中
        map[index] = res;
        return res;
    }


    /**
     * 解码方法
     * dfs算法
     * @author HCY
     * @since 2021/4/21 6:54 上午
     * @param s: 32 位 的整数。
     * @return int
    */
    public static int numDecodings_1(String s) {
        if (s.length() < 1 || s.charAt(0) == '0'){ return 0; }
        return dfs(0,s);
    }
    private static int dfs(int i, String s) {
        if ( s.length() <= i) { return 1; }
        int ans = 0;
        if (i + 2 <= s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) { ans += dfs(i + 2, s); }
        }
        if (s.charAt(i) != '0') { ans += dfs(i + 1, s); }
        return ans;
    }
}
