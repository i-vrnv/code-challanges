package leetcode.archive.Problem_297_Serialize_and_Deserialize_Binary_Tree;

import leetcode.common.TreeNode;

import java.util.*;

/**
 * Runtime: 10 ms, faster than 72.86% of Java online submissions for Serialize and Deserialize Binary Tree.
 * Memory Usage: 41.9 MB, less than 43.30% of Java online submissions for Serialize and Deserialize Binary Tree.
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringJoiner sb = new StringJoiner(",");
        join(root, sb);
        return sb.toString();
    }

    private void join(TreeNode node, StringJoiner sj) {
        if (node == null) {
            sj.add("null");
        } else {
            sj.add(String.valueOf(node.val));
            join(node.left, sj);
            join(node.right, sj);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> nodes = Arrays.asList(data.split(","));
        Deque<String> dq = new LinkedList<>(nodes);
        return deserial(dq);
    }

    private TreeNode deserial(Deque<String> dq) {
        String value = dq.remove();
        if (value.equals("null")) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.parseInt(value));
            node.left = deserial(dq);
            node.right = deserial(dq);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));