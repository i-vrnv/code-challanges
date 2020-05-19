package leetcode.Problem_133_Clone_Graph;

import leetcode.common.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Integer, Node> storage = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (storage.containsKey(node.val)) {
            return storage.get(node.val);
        }

        Node cloned = new Node(node.val, new ArrayList<Node>());
        storage.put(cloned.val, cloned);

        for (Node n : node.neighbors) {
            cloned.neighbors.add(cloneGraph(n));
        }
        return cloned;
    }
}