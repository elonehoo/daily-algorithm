package com.algorithm.year2021.march.a2twentySeven.code;

/**
 * 单链表的定义。
 * Definition for singly-linked list.
 * @author HCY
 * @since 2021/3/27 下午9:19
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
        this.val = val; this.next = next;
    }
}
