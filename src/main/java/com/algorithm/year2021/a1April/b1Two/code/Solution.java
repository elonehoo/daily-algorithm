package com.algorithm.year2021.a1April.b1Two.code;


import java.util.Arrays;

/**
 * 解决方案 
 * @author HCY
 * @since 2021/4/2 下午12:33
*/
public class Solution {

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trap_1(arr));
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

    public static int trap_1(int[] height){
        //如果数组长度为0，直接输出0
        if (height.length <= 0){ return 0; }
        //设置一个备份数组，进行备份操作
        int[] arr = height.clone();
        //进行排序操作
        Arrays.sort(arr);
        //设置一个总面积
        int volume = 0;
        //设置一个返回值
        int sum = 0;
        //设置一个开始值
        int start = 0;
        //设置一个结束值
        int oven = 0;
        //寻找每一层的开始和结束,以至于计算出总面积
        for (int i = 1; i <= arr[arr.length - 1]; i++ ){
            //开始的位置
            start = seekStart(i,height);
            //结束的位置
            oven = seekOven(i,height);
            //计算出全面积
            volume += oven - start + 1;
        }
        //计算围墙的面积
        for (int i : height) {
            sum += i;
        }
        //计算出水的面积
        return volume - sum;
    }

    /**
     * 找结束的位置
     * @author HCY
     * @since 2021/4/2 下午4:00
     * @param frequency: 行数
     * @param height: 数组
     * @return int
    */
    private static int seekOven(int frequency, int[] height) {
        for (int i = height.length - 1;  i >= 0; i--) {
            if (height[i] >= frequency){ return i; }
        }
        return 0;
    }

    /**
     * 找开始的次数
     * @author HCY
     * @since 2021/4/2 下午4:00
     * @param frequency: 行数
     * @param height: 数组
     * @return int
    */
    private static int seekStart(int frequency, int[] height) {
        for (int i = 0; i <= height.length - 1; i++) {
            if (height[i] >= frequency){ return i; }
        }
        return 0;
    }


}
