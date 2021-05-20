package com.algorithm.year2021.a2May.b14;

import java.util.*;

/**
 * @description: 前K个高频单词
 * @version: V1.0
 * @author XiaoXunYao
 * @since 2021/5/20 3:38 下午
*/
public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        List<String> rec = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return cnt.get(word1).equals(cnt.get(word2)) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
            }
        });
        return rec.subList(0, k);

    }
}
