package com.algorithm.year2021.a1April.b12Thirteen.code;

/**
 * 二叉树节点的定义。
 * @author HCY
 * @since 2021/4/13 下午10:41
*/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
