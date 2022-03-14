package leetcode.Problem_94_Binary_Tree_Inorder_Traversal;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        var result = new LinkedList<Integer>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> list) {
        if (node == null) return;
        traverse(node.left, list);
        list.add(node.val);
        traverse(node.right, list);
    }
}