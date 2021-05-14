package com.algorithm.year2021.a2May.b12.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/14 12:23 下午
*/
public class Solution {

    public String intToRoman(int num) {
        //设置罗马
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for (int i = 0; i < val.length; i++) {
            int cv = val[i];
            String cs = str[i];
            while (num >= cv){
                result += cs;
                num -= cv;
            }
        }
        return result;
    }
}
