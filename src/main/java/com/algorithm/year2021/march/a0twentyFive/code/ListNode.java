package com.algorithm.year2021.march.a0twentyFive.code;

/**
 * 链表
 * @author HCY
 * @since 2021/3/25 下午8:26
*/
public class ListNode {

    int val;

    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
