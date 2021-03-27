package com.algorithm.year2021.march.a1twentySix.code;

/**
 * 算法代码
 * @author HCY
 * @since 2021/3/26 下午7:28
*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //判断链表是否为null
        if (head == null || head.next == null) {
            return head;
        }
        //递归调用
        head.next = this.deleteDuplicates(head.next);
        if (head.val == head.next.val){
            head = head.next;
        }
        return head;
    }
}
