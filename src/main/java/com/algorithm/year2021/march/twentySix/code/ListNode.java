package com.algorithm.year2021.march.twentySix.code;

/**
 * 单链表的定义
 * @author HCY
 * @since 2021/3/26 下午7:26
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
