package com.algorithm.year2021.a2May.b02Two.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/2 6:58 上午
*/
public class Solution {
    /**
     * 砖墙
     * @author HCY
     * @since 2021/5/2 6:59 上午
     * @param wall: 一堵矩形的、由 n 行砖块组成的砖墙
     * @return int
    */
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxEmpty = 0;
        for (List<Integer> list : wall) {
            int pos = 0;
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                pos += list.get(i);
                map.put(pos,map.getOrDefault(pos,0) + 1);
                maxEmpty = Math.max(maxEmpty,map.get(pos));
            }
        }
        return wall.size() - maxEmpty;
    }
}
