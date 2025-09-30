package Actual2025.trees;

public class PreOrderDemo {
    Node root;

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String[] args) {

        // create an object of BinaryTree
        PreOrderDemo tree = new PreOrderDemo();

        // create nodes of the tree
        tree.root = new Node(12);
        tree.root.left = new Node(14);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(22); //left to 14
        tree.root.left.right = new Node(24);//right to 14
        tree.root.right.left = new Node(20);//left to 16
        tree.root.right.right = new Node(18);//right to 16
        System.out.print("\nBinary Tree: ");
        tree.preorder(tree.root);
        System.out.print("\n");

    }
}