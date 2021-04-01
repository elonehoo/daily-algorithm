package com.algorithm.year2021.a0March.b0TwentyFive.code;

/**
 * 删除排序链表中的重复元素 II
 * Removes the duplicate element II in the sorted list
 * @author HCY
 * @since 2021/3/25 下午8:06
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //如若 链表 为空 --> 则直接输出 null 。
        if (head == null){
            return null;
        }
        //如若不为空 --> 则取出第一个
        ListNode node = new ListNode(0, head);
        ListNode cour = node;
        //循环判断是否重复
        while (cour.next != null && cour.next.next != null){
            //判断与下一个元素是否相等
           if (cour.next.val == cour.next.next.val){
               int x = cour.next.val;
               while (cour.next != null && cour.next.val == x){
                   cour.next = cour.next.next;
               }
           }else {
               cour = cour.next;
           }
        }
        return node.next;
    }

    public ListNode deleteDuplicates_2(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        if (head.val != head.next.val){
            head.next = deleteDuplicates_2(head.next);
            return head;
        }else {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates_2(head.next);
        }
    }
}
