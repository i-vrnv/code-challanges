package cracking.trees.binary;

public class InOrderTraversal {

    public void traverse(BinaryTreeNode node) {
        traverse(node.getLeft());
        System.out.println(node.getValue());
        traverse(node.getRight());
    }
}
