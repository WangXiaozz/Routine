package com.wkj.cn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wkj
 * @Date: 2024/7/25
 */
public class SubSet {
    /**
     * https://leetcode.cn/problems/subsets/description/
     * 给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能子集
     * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
     * 示例 1：
     * 输入：nums = [1,2,3]
     * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * 示例 2：
     * 输入：nums = [0]
     * 输出：[[],[0]]
     * 提示：
     * 1 <= nums.length <= 10
     * -10 <= nums[i] <= 10
     * nums 中的所有元素 互不相同
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for (Integer num : nums){
            List<List<Integer>> tempSet = new ArrayList<>();
            for(List<Integer> element: result){
                List<Integer> temp = new ArrayList<Integer>(element);
                temp.add(num);
                tempSet.add(temp);
            }
            result.addAll(tempSet);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int[] nums2 = new int[]{3,2,4,1};
        List<List<Integer>> ret = subsets(nums);
        List<List<Integer>> ret2 = subsets(nums2);
        System.out.println(ret);
        System.out.println(ret2);
    }
}
