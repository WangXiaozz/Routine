package com.wkj.cn.easy;

import com.wkj.cn.easy.enity.TreeNode;

/**
 * @Author: wkj
 * @Date: 2024/7/25
 */
public class FlipBinaryTree {
    /**
     * https://leetcode.cn/problems/invert-binary-tree/description/
     * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     *
     * 输入：root = [2,1,3]
     * 输出：[2,3,1]
     */

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1Left = new TreeNode(1);
        TreeNode root1Right = new TreeNode(3);
        TreeNode root1 = new TreeNode(2,root1Left,root1Right);
        System.out.println(invertTree(root1));
    }

}
