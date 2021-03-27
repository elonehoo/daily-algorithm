package com.algorithm.year2021.march.a0twentyFive.code;

/**
 * 测试代码
 * @author HCY
 * @since 2021/3/25 下午8:26
*/
public class SolutionTest {
    public static void main(String[] args) {
        ListNode listNode1 =
                new ListNode(1,
                new ListNode(1,
                new ListNode(1,
                new ListNode(2,
                new ListNode(3)))));

        ListNode listNode2 =
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3,
                new ListNode(4,
                new ListNode(4,
                new ListNode(5)))))));
        Solution solution = new Solution();
        System.out.println(solution.deleteDuplicates_2(listNode1));
        System.out.println(solution.deleteDuplicates_2(listNode2));
    }
}
