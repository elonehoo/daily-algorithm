package com.algorithm.year2021.a1April.b24TwentyFive.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/29 10:34 上午
*/
public class Solution {
    /**
     * 青蛙过河
     * @author HCY
     * @since 2021/4/29 10:34 上午
     * @param stones: 石子的位置列表
     * @return boolean
    */
    public boolean canCross(int[] stones) {
        int[][] map = new int[stones.length][stones.length];
        return dfs_2(stones, 0, 0, map) == 1 ? true : false;
    }

    /**
     * dfs算法
     * @author HCY
     * @since 2021/4/29 12:54 下午
     * @param stones:
     * @param index:
     * @param lastStep:
     * @param map:
     * @return int
    */
    private int dfs_2(int[] stones, int index, int lastStep, int[][] map) {
        if (index == stones.length - 1) { return 1; }
        if (map[index][lastStep] != 0) {
            return map[index][lastStep];
        }
        for (int i = 1; i >= -1; i--) {
            int nextStep = lastStep - i;
            if (nextStep <= 0) { continue; }
            int nextIndex = -1;
            for (int k = index + 1; k < stones.length; k++) {
                if (nextStep + stones[index] == stones[k]) {
                    nextIndex = k;
                    break;
                } else if (nextStep + stones[index] < stones[k]) {
                    break;
                }
            }

            if (nextIndex > 0 && dfs_2(stones, nextIndex, nextStep, map) == 1) {
                map[index][lastStep] = 1;
                map[nextIndex][nextStep] = 1;
                return 1;
            }
        }
        map[index][lastStep] = -1;
        return -1;
    }

    /**
     * dfs算法（超时）
     * @author HCY
     * @since 2021/4/29 10:56 上午
     * @param stones:
     * @param index:
     * @param lastStep:
     * @return boolean
    */
    private boolean dfs_1(int[] stones, int index, int lastStep) {
        //边界条件判断，到达叶子节点，也就最后一个石头
        if (index == stones.length - 1) { return true; }
        //每个节点最多有3个子节点，我们来遍历他的3个子节点，相当于每个石头可以跳
        //3个位置（除了第1个），分别是lastStep-1，lastStep，lastStep+1
        for (int i = 1; i >= -1; i--) {
            //下一步跳的步数
            int nextStep = lastStep - i;
            //下一步跳不动了，比如在第一个位置0的时候只能跳1位置，不能跳到位置-1（也没这个位置）
            if (nextStep <= 0) { continue; }
            //下一步跳的石头索引
            int nextIndex = -1;

            //我们这里遍历后面的所有石头，直到跳不到的时候终止
            for (int k = index + 1; k < stones.length; k++) {
                //如果正好能跳到下一个石头
                if (nextStep + stones[index] == stones[k]) {
                    nextIndex = k;
                    break;
                } else if (nextStep + stones[index] < stones[k]) {
                    //如果下一个石头太远了，跳不过去了，那后面的石头就
                    //更跳不过去了，不要在往后判断了
                    break;
                }
            }
            //如果能跳到后面的石头上面，说明后面的这个节点是有效的子节点，就以后面的那个石头再往后跳
            if (nextIndex > 0 && dfs_1(stones, nextIndex, nextStep)) {
                return true;
            }
        }
        //如果这3步都不能跳到石头上，直接返回false
        return false;
    }


}
