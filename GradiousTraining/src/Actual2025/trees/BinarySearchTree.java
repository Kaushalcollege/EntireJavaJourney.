package Actual2025.trees;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;

    public Node(){}
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public Node root;
    
    public BinarySearchTree(){ //constructor
        root = null;
    }

    public Node insert(int[] arr, int idx){ // normal insert
        if (idx < arr.length){
            Node node = new Node(arr[idx]);
            node.left = insert(arr, 2*idx + 1);
            node.right = insert(arr, 2*idx + 2);
            return node;
        }
        return null;
    }

    public Node binaryInsert(int val, Node root){ // insertion in bst.
        if (root == null) return new Node(val);
        if (root.val > val) root.left = binaryInsert(val, root.left);
        else if(root.val < val) root.right = binaryInsert(val, root.right);

        return root;
    }

    public void traverseInorder(Node node, List<Integer> ans) {
        if (node != null) {
            traverseInorder(node.left, ans);
            ans.add(node.val);
            traverseInorder(node.right, ans);
        }
    }

    public void postorder(Node node, List<Integer> ans) {
        if (node != null) {
            postorder(node.left, ans);
            postorder(node.right, ans);
            ans.add(node.val);
        }
    }

    public void preorder(Node node, List<Integer> ans) {
        if (node != null) {
            ans.add(node.val);
            preorder(node.left, ans);
            preorder(node.right, ans);
        }
    }

    public ArrayList<Integer> leafNodes(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        findNodes(node, list);
        return list;
    }

    public void findNodes(Node node, ArrayList<Integer> list){
        if (node != null){
            if (node.left == null && node.right == null) list.add(node.val);
            if (node.left == null && node.right != null) findNodes(node.right, list);
            else if (node.left != null && node.right == null) findNodes(node.left, list);
            else{
                findNodes(node.left, list);
                findNodes(node.right, list);
            }
        }
        if (node == null) return;
    }

    public ArrayList<Integer> singleChildren(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        findBrats(node, list);
        return list;
    }

    public void findBrats(Node node, ArrayList<Integer> ans){
        if (node != null){
            if ((node.left == null && node.right != null) || node.left != null && node.right == null){
                ans.add(node.val);
                findBrats(node.right, ans);
            }
            else if (node.left != null && node.right == null){
                ans.add(node.val);
                findBrats(node.left, ans);
            }
            else{
                findBrats(node.left, ans);
                findBrats(node.right, ans);
            }
        }
        if (node == null) return;
    }

    public ArrayList<Integer> printPath(Node root, int key){
        ArrayList<Integer> list = new ArrayList<>();
        findPath(root, key, list);
        return list;
    }

    public void findPath(Node node, int key, ArrayList<Integer> ans){
        if (node == null) return;

        ans.add(node.val);

        if (key == node.val) return;

        else if (key < node.val) findPath(node.left, key, ans);

        else findPath(node.right, key, ans);
    }

    public void pathHelpStack(
        Node root,
        int key,
        Stack<Integer> temp,
        ArrayList<Stack<Integer>> fin)
{
    // If this node is the target, add the stack to final ArrayList
    if (root.val == key) {
        fin.add((Stack<Integer>)temp.clone());
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


    public void levelOrder(Node root, List<Integer> ans) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node node = queue.poll();
        ans.add(node.val);

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }
}

    void inOrder(Node node, List<Integer> ans){
        if (node == null) return;
        else{
            inOrder(node.left, ans);
            ans.add(node.val);
            inOrder(node.right, ans);
        }
    }

    public boolean isItThere(Node node, int x){
        if (node == null) return false;

        if (node.val == x) return true;

        if (x < node.val) return isItThere(node.left, x);

        else return isItThere(node.right, x);
    }

    public void populateSorted(int[] nums){
    this.root = populateSorted(nums, 0, nums.length, this.root);
}

private Node populateSorted(int[] nums, int start, int end, Node root){
    if (start >= end) return root;

    int mid = (start + end) / 2;
    root = binaryInsert(nums[mid], root);

    root = populateSorted(nums, start, mid, root);
    root = populateSorted(nums, mid + 1, end, root); // mid + 1 to avoid infinite loop

    return root;
}


    public static void main(String[] args) {
        int[] arr = {10, 28, 8, 1, 4, 9, 11};
        BinarySearchTree t1 = new BinarySearchTree();
        // t1.root = t1.binaryInsert(12, t1.root);
        // t1.root = t1.binaryInsert(23, t1.root);
        // t1.root = t1.binaryInsert(3, t1.root);
        for (int i : arr){
            t1.root = t1.binaryInsert(i, t1.root);
        }
        List<Integer> list2 = new ArrayList<>();
        t1.traverseInorder(t1.root, list2);
        System.out.println(list2);
        System.out.println();
        List<Integer> list3 = new ArrayList<>();
        t1.postorder(t1.root, list3);
        System.out.println(list3);
        System.out.println();
        List<Integer> list4 = new ArrayList<>();
        t1.levelOrder(t1.root, list4);
        System.out.println(list4);
        System.out.println();
        List<Integer> list = new ArrayList<>();
        t1.inOrder(t1.root, list);
        System.out.println(list);
        System.out.println();
        List<Integer> list1 = new ArrayList<>();
        t1.preorder(t1.root, list1);
        System.out.println(list1);
        System.out.println();
        List<Integer> leaf = t1.leafNodes(t1.root);
        System.out.println(leaf);
        System.out.println();
        List<Integer> singleParents = t1.singleChildren(t1.root);
        System.out.println(singleParents);
        System.out.println();
        List<Integer> path = t1.printPath(t1.root, 28);
        System.out.println(path);
        System.out.println();
        Stack<Integer> s = t1.pathFindStack(t1.root, 28);
        System.out.println(s);
        System.out.println(t1.isItThere(t1.root, 23));
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearchTree t2 = new BinarySearchTree();
        t2.populateSorted(arr1);
        System.out.println();
        List<Integer> list5 = new ArrayList<>();
        t2.levelOrder(t2.root, list5);
        System.out.println(list5);
        System.out.println();
    }

    //1st July 2025
    //deletions in BST.
    public Node deleteLeaf(Node root, int LeafKey){
        if (root.val > LeafKey){
            root.left = deleteLeaf(root.left, LeafKey);
        }
        else if (root.val < LeafKey){
            root.right = deleteLeaf(root.right, LeafKey);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
        }
        return root;
    }

    public Node deleteSingleParent(Node root, int singleParentKey){
        if(root.val > singleParentKey){
            root.left = deleteSingleParent(root.left, singleParentKey);
        }
        else if (root.val < singleParentKey){
            root.right = deleteSingleParent(root.right, singleParentKey);
        }
        else{
            if (root.left != null && root.right == null){
                return root.left;
            }
            else{
                return root.right;
            }
        }
        return root;
    }

    public Node deleteParentWithTwoChildren(Node root, int key){
        //inorder predecessor or successor
        //inorder successor -- right subtree's left extreme.
        if(root.val > key){
            root.left = deleteParentWithTwoChildren(root.left, key);
        }
        else if (root.val < key){
            root.right = deleteParentWithTwoChildren(root.right, key);
        }
        else{
            //successor
            Node temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }
            root.val = temp.val;
            if (temp.left == null && temp.right == null){
                root.right = deleteLeaf(root.right, temp.val);
            }
            else{
                root.right = deleteSingleParent(root.right, temp.val);
            }
        }
        return root;
    }

    public Node generalDelete(Node node, int key){
        if (node == null) return null;

        if (key < node.val){
            node.left = generalDelete(node.left, key);
        }

        else if (key > node.val){
            node.right = generalDelete(node.right, key);
        }

        else{
            if (node.left == null && node.right == null){
                return null;
            }
            else if (node.left == null && node.right != null){
                return node.right;
            }
            else if (node.left != null && node.right == null){
                return node.left;
            }
            else{
                Node temp = node.right;
                while(temp.left != null) temp = temp.left;
                node.val = temp.val;
                node.right = generalDelete(node.right, temp.val);
            }
        }
        return node;
    }

}
