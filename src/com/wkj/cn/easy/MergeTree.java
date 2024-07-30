package com.wkj.cn.easy;

import com.wkj.cn.easy.enity.TreeNode;

import java.util.Objects;

/**
 * @Author: wkj
 * @Date: 2024/7/30
 */
public class MergeTree {
    /**
     * 合并二叉树
     * 合并的规则是：
     * 如果两个节点重叠，那么将这两个节点的值相加作为合并后节点的新值；
     * 否则，不为 null 的节点将直接作为新二叉树的节点。
     */

    public static TreeNode Merge(TreeNode root1, TreeNode root2){
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode root = new TreeNode(root1.val + root2.val);
        TreeNode left = Merge(root1.left,root2.left);
        TreeNode right = Merge(root1.right,root2.right);
        root.left = left;
        root.right = right;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1,new TreeNode(2),null);
        TreeNode ret1 = Merge(root1,root2);
        System.out.println(ret1);

        TreeNode rootTest1 = new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2));
        TreeNode rootTest2 = new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7)));
        TreeNode ret2 = Merge(rootTest1,rootTest2);
        System.out.println(ret2.val);
    }


}
