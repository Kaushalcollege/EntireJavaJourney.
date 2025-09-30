package Actual2025.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class AVLNode{
    int val;
    AVLNode left;
    AVLNode right;
    int nHeight;

    public AVLNode() {
    }

    public AVLNode(int val, AVLNode left, AVLNode right, int nHeight) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.nHeight = nHeight;
    }
    public AVLNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
        nHeight = 1;
    }

}

public class AVLTree {
    public AVLNode root;

    public AVLTree(){
        root = null;
    }

    public int getHeight(AVLNode root){
        if (root == null) return 0;
        return root.nHeight;
    }

    public int balanceFactor(AVLNode left, AVLNode right){
        return getHeight(left) - getHeight(right);
    }

    public AVLNode leftRotate(AVLNode x){
        AVLNode y = x.right;
        AVLNode temp = y.left;
        AVLNode z = y.right;

        y.left = x;
        x.right = temp;

        x.nHeight = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        y.nHeight = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    public AVLNode rightRotate(AVLNode z){
        AVLNode y = z.left;
        AVLNode temp = y.right;
        AVLNode x = y.left;

        y.right = z;
        z.left = temp;

        z.nHeight = 1 + Math.max(getHeight(z.left), getHeight(z.right));

        y.nHeight = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    public AVLNode insert(AVLNode root, int key){
        if (root == null){
            return new AVLNode(key);
        }
        if (root.val > key){
            //go left
            root.left = insert(root.left, key);
        }
        else if (root.val < key){
            //go right
            root.right = insert(root.right, key);
        }

        //update height
        root.nHeight = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        //balance factor:
        int balance = balanceFactor(root.left, root.right);

        if (balance < -1 && root.right.val < key){

            // left rotate LR
            return leftRotate(root);
        }

        else if (balance < -1 && root.right.val > key){
            // rotate right and then left
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        else if (balance > 1 && root.left.val > key){
            //right rotate RR
            return rightRotate(root);
        }

        else if (balance > 1 && root.left.val < key){
            //first rotate left and then right
            root.left = leftRotate(root.left);

            return rightRotate(root);
        }

        return root;
    }

    public static void main(String[] args) {
        AVLTree tree1 = new AVLTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr){
            tree1.root = tree1.insert(tree1.root, i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        tree1.levelOrder(tree1.root, list);
        System.out.println(list);
    }

    public void levelOrder(AVLNode root, List<Integer> ans) {
    if (root == null) return;

    Queue<AVLNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        AVLNode node = queue.poll();
        ans.add(node.val);

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }

  }
}
