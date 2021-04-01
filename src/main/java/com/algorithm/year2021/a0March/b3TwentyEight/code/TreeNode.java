package com.algorithm.year2021.a0March.b3TwentyEight.code;

/**
 * 二叉树节点的定义。
 * @author HCY
 * @since 2021/3/28 下午10:15
*/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
}
