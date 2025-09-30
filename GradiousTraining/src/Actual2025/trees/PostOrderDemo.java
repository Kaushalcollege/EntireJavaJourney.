package Actual2025.trees;

public class PostOrderDemo {
    Node root;

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void main(String[] args) {

        // create an object of BinaryTree
        PostOrderDemo tree = new PostOrderDemo();

        // create nodes of the tree
        tree.root = new Node(12);
        tree.root.left = new Node(14);
        tree.root.right = new Node(16);
        tree.root.left.left = new Node(22); //left to 14
        tree.root.left.right = new Node(24);//right to 14
        tree.root.right.left = new Node(20);//left to 16
        tree.root.right.right = new Node(18);//right to 16
        System.out.print("\nBinary Tree: ");
        tree.postorder(tree.root);
        System.out.print("\n");

    }
}
