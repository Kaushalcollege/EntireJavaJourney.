package Actual2025.trees;

public class InOrderDemo {
    Node root;

    public void traverseInorder(Node node) {
        if (node != null) {
            traverseInorder(node.left);
            System.out.print(" " + node.val);
            traverseInorder(node.right);
        }
    }

    public static void main(String[] args) {

        // create an object of BinaryTree
        InOrderDemo tree = new InOrderDemo();

        // create nodes of the tree
        tree.root = new Node(12);
        tree.root.left = new Node(14);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(22); //left to 14
        tree.root.left.right = new Node(24);//right to 14
        tree.root.right.left = new Node(20);//left to 16
        tree.root.right.right = new Node(18);//right to 16
        System.out.print("\nBinary Tree: ");
        tree.traverseInorder(tree.root);
        System.out.print("\n");

    }
}