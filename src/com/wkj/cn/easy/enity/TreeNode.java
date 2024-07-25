package com.wkj.cn.easy.enity;

/**
 * @Author: wkj
 * @Date: 2024/7/25
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
