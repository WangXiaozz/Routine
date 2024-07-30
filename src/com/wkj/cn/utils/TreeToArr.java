package com.wkj.cn.utils;

import com.wkj.cn.easy.enity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wkj
 * @Date: 2024/7/30
 */
public class TreeToArr {
    public static List<Integer> ChangeToArr(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        list.add(root.val);
        list.addAll(AddNode(root.left,root.right));
        return null;
    }

    private static List<Integer> AddNode(TreeNode left, TreeNode right){
        List<Integer> list = new ArrayList<>();
        list.add(left.val);
        list.add(right.val);
        return list;
    }
}
