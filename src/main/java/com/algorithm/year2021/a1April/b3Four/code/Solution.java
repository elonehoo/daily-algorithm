package com.algorithm.year2021.a1April.b3Four.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/4 下午3:06
*/
public class Solution {
    /**
     * 森林中的兔子
     * @author HCY
     * @since 2021/4/4 下午3:07
     * @param answers: 兔子的答案
     * @return int
    */
    public int numRabbits(int[] answers) {
        int[] rabbit = new int[1000];
        int result = 0;
        for (int answer : answers) {
            if (rabbit[answer] == 0){
                rabbit[answer] = answer;
                result += answer + 1;
            }else{
                rabbit[answer] --;
            }
        }
        return result;
    }
}
