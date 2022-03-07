package cracking.trees.binary;

public class PostOrderTraversal {

    public void traverse(BinaryTreeNode node) {
        traverse(node.getLeft());
        traverse(node.getRight());
        System.out.println(node.getValue());
    }
}
