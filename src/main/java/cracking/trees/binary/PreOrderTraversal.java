package cracking.trees.binary;

public class PreOrderTraversal {

    public void traverse(BinaryTreeNode node) {
        System.out.println(node.getValue());
        traverse(node.getLeft());
        traverse(node.getRight());
    }
}
