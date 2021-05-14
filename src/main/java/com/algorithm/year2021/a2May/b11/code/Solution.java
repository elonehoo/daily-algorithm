package com.algorithm.year2021.a2May.b11.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/11 10:26 上午
*/
public class Solution {
    /**
     * 解码异或后的排列
     * @author HCY
     * @since 2021/5/11 10:27 上午
     * @param encoded: 整数数组
     * @return int[]
    */
    public int[] decode(int[] encoded) {
        int len = encoded.length;
        int[] perm = new int[len + 1];

        //求perm数组的所有元素异或值
        int totalPerm = 0;
        for(int i = 1;i <= len + 1 ; i++){
            totalPerm = totalPerm ^ i;
        }

        //求encoded数组中除了perm[0]以外的异或值
        int totalEncoded = 0;
        for(int i = 1;i < len;i += 2){
            totalEncoded = totalEncoded ^ encoded[i];
        }

        int start = totalPerm ^ totalEncoded;
        perm[0] = start;
        for(int i = 1;i < len + 1 ;i++){
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        return perm;
    }
}
