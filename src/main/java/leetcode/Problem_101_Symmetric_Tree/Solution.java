package leetcode.Problem_101_Symmetric_Tree;

import leetcode.common.TreeNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
 * Memory Usage: 37.6 MB, less than 86.39% of Java online submissions for Symmetric Tree.
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null) return false;
        if (right == null) return false;
        if (left.val != right.val) { return false; }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}