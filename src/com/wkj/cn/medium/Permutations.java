package com.wkj.cn.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wkj
 * @Date: 2024/8/5
 */
public class Permutations {

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列
     * 输入：nums = [1,2,3]
     * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     * @param state
     * @return
     */

    /* 判断当前状态是否为解 */
    boolean isSolution(List<Integer> state) {
        return !state.isEmpty();
    }

    /* 记录解 */
    void recordSolution(List<Integer> state, List<List<Integer>> res) {
        res.add(new ArrayList<>(state));
    }

    /* 判断在当前状态下，该选择是否合法 */
    boolean isValid(Integer choice) {
        return choice != null;
    }

    /* 更新状态 */
    void makeChoice(List<Integer> state, Integer choice) {
        state.add(choice);
    }

    /* 恢复状态 */
    void undoChoice(List<Integer> state, Integer choice) {
        state.remove(state.size() - 1);
    }

    /* 回溯算法 */
    void backtrack(List<Integer> state, List<Integer> choices, List<List<Integer>> res) {
        // 检查是否为解
        if (isSolution(state)) {
            // 记录解
            recordSolution(state, res);
        }
        // 遍历所有选择
        for (Integer choice : choices) {
            // 剪枝：检查选择是否合法
            if (isValid(choice)) {
                // 尝试：做出选择，更新状态
                makeChoice(state, choice);
                // 进行下一轮选择
                backtrack(state, choices, res);
                // 回退：撤销选择，恢复到之前的状态
                undoChoice(state, choice);
            }
        }
    }
}
