package com.algorithm.year2021.march.a2twentySeven.code;

/**
 * 旋转链表
 * Rotate List
 * @author HCY
 * @since 2021/3/27 下午9:21
*/
public class Solution {
    /**
     * 已经反转的次数
     */
    private int count = 0;
    private ListNode head;

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        this.head = head;
        helper(head, k, 1);
        return this.head;
    }

    /**
     *
     * @author HCY
     * @since 2021/3/27 下午9:52
     * @param node: 链表
     * @param k: 反转次数
     * @param count: 已经反转的次数
     * @return void
    */
    private void helper(ListNode node, int k, int count) {
        if(node.next == null) {
            node.next = head;
            this.count = count;
        } else {
            helper(node.next, k, count + 1);
        }

        if(count == this.count - k % this.count) {
            this.head = node.next;
            node.next = null;
        }
    }

}
