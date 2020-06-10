package leetcode.Problem_226_Invert_Bynary_Tree;

import leetcode.common.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        return flip(root);
    }

    private TreeNode flip(TreeNode n) {
        if (n == null) return null;
        TreeNode tmp = n.left;
        n.left = flip(n.right);
        n.right = flip(tmp);
        return n;
    }
}