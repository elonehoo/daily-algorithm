package com.algorithm.year2021.a1April.b22TwentyThree.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/27 7:56 下午
*/
public class Solution {

    int sum = 0;

    /**
     * 二叉搜索树的范围和
     * @author HCY
     * @since 2021/4/27 7:56 下午
     * @param root: 二叉搜索树的根结点
     * @param low: 起点
     * @param high: 终点
     * @return int
    */
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return sum;
    }

    private void dfs(TreeNode root, int low, int high) {
        if (root == null){
            return;
        }else {
            dfs(root.left,low,high);
            if (low <= root.val && root.val <= high) {
                sum += root.val;
            }
            dfs(root.right, low, high);
        }

    }
}
