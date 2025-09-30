package Actual2025.trees;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int val;
    Node left, right;

    public Node(int value) {
        this.val = value;
        this.left = right = null;
    }
}

class BinaryTree {
    Node root;

    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.val);
            traverseTree(node.right);
        }
    }

    public void pathHelpStack(
        Node root,
        int key,
        Stack<Integer> temp,
        ArrayList<Stack<Integer>> fin)
{
    // If this node is the target, capture the full stack
    if (root.val == key) {
        // clone the stack so future pops don’t mutate it
        fin.add((Stack<Integer>) temp.clone());
        return;
    }

    // Only go left if we haven't found a path yet
    if (fin.isEmpty() && root.left != null) {
        temp.push(root.left.val);
        pathHelpStack(root.left, key, temp, fin);
        temp.pop();
    }

    // Then dive right if still not found
    if (fin.isEmpty() && root.right != null) {
        temp.push(root.right.val);
        pathHelpStack(root.right, key, temp, fin);
        temp.pop();
    }
}

public Stack<Integer> pathFindStack(Node root, int key) {
    ArrayList<Stack<Integer>> fin = new ArrayList<>();
    Stack<Integer> temp = new Stack<>();
    temp.push(root.val);
    pathHelpStack(root, key, temp, fin);
    return fin.get(0);
}
public static void main(String[] args) {

    // create an object of BinaryTree
    BinaryTree tree = new BinaryTree();

    // create nodes of the tree
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);

    System.out.print("\nBinary Tree: ");
    tree.traverseTree(tree.root);
    System.out.print("\n");

    System.out.println(tree.pathFindStack(tree.root, 2));
}
}