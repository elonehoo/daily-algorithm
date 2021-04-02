package com.algorithm.year2021.a1April.b1Two.code;


/**
 * 解决方案 
 * @author HCY
 * @since 2021/4/2 下午12:33
*/
public class Solution {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }


    /**
     * 直方图的水量
     * @author HCY
     * @since 2021/4/2 下午12:33
     * @param height: 直方图的组成
     * @return int
    */
    public static int trap(int[] height) {
        int length = height.length;
        int ans = 0;
        for (int i = 1; i < (length - 1); i++) {
            int cur = height[i];
            int l = 0;
            int r = 0;
            for (int j = i; j >= 0; j--) { l = Math.max(l,height[j]); }
            for (int j = i; j < length; j++){ r = Math.max(r,height[j]); }
            ans += Math.min(l , r) - cur;
        }
        return ans;
    }
}
