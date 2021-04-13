package com.algorithm.year2021.a1April.b12Thirteen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/13 下午10:42
*/
public class Solution {
    /**
     * 二叉搜索树节点最小距离
     * @author HCY
     * @since 2021/4/13 下午10:43
     * @param root: 二叉树
     * @return int
    */
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode preNode = null;
        //首先把根节点赋值给cur
        TreeNode cur = root;
        //如果cur不为空就继续遍历
        while (cur != null) {
            if (cur.left == null) {
                //1，这个地方需要修改，记录差值的最小值
                if (preNode != null) {
                    min = Math.min(min, cur.val - preNode.val);
                }
                preNode = cur;
                cur = cur.right;
            } else {
                TreeNode pre = cur.left;
                //查找pre节点，注意这里有个判断就是pre的右子节点不能等于cur
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                //如果pre节点的右指针指向空，我们就让他指向当前节点cur，
                //然后当前节点cur指向他的左子节点
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;
                    //2，这个地方也需要修改，记录差值的最小值
                    if (preNode != null) {
                        min = Math.min(min, cur.val - preNode.val);
                    }
                    preNode = cur;
                    cur = cur.right;
                }
            }
        }
        return min;
    }

}
