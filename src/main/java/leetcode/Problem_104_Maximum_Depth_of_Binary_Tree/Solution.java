package leetcode.Problem_104_Maximum_Depth_of_Binary_Tree;

import leetcode.common.TreeNode;

/**
 * Runtime: 1 ms, faster than 13.29% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 40.9 MB, less than 5.38% of Java online submissions for Maximum Depth of Binary Tree.
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int deepestSubtree = Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
        return Math.max(1, deepestSubtree);
    }
}