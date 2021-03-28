package com.algorithm.year2021.march.a3twentyEight.code;

import java.util.Deque;
import java.util.LinkedList;

public class BSTIterator {

    private Deque<Integer> queue = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        transition(root);
    }

    public void transition(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        this.transition(treeNode.left);
        queue.add(treeNode.val);
        this.transition(treeNode.right);
        return;
    }

    public int next() {
        return queue.removeFirst();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
