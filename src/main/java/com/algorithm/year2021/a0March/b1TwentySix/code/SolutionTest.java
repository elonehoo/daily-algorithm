package com.algorithm.year2021.a0March.b1TwentySix.code;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(2,new ListNode(3,new ListNode(3))))));
        Solution solution = new Solution();
        System.out.println(solution.deleteDuplicates(listNode));
    }
}
