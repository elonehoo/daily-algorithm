package com.algorithm.year2021.a1April.b25TwentySix.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/30 3:30 下午
*/
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1){
                return integer;
            }
        }
        return -1;
    }
}
