package com.algorithm.year2021.a1April.b20TwentyOne.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/25 7:59 下午
*/
public class Solution {

    /**
     * 递增顺序搜索树
     * @author HCY
     * @since 2021/4/25 7:59 下午
     * @param root: 树节点
     * @return com.algorithm.year2021.a1April.b20TwentyOne.code.TreeNode
    */
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        for (TreeNode node : list) {
            cur.right = node;
            node.left = null;
            cur = node;
        }
        return dummy.right;
    }

    private void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null){ return; }
        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);
    }
}
