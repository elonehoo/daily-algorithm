package com.algorithm.year2021.a1April.b20TwentyOne.code;

/**
 * Definition for a binary tree node.
 * @author HCY
 * @since 2021/4/25 7:58 下午
*/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
