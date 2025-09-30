package Actual2025.trees;

// segment tree needs question array and segment array.
// so i will create a segment tree data structure:

public class SegmentTree {

    //it needs a segment array:
    int[] segArr;
    int[] question;
    int segmentSize;

    public SegmentTree(int[] question){
        this.question = question;
        segmentSize = 4 * question.length;
        build(0, question.length - 1, 0);
    }

    public int build(int low, int high, int segmentIndex){

        int leftChildrenIndex = 2 * segmentIndex + 1;
        int rightChildrenIndex = 2 * segmentIndex + 2;

        if (low == high){
            //update segment array and then return.
            //after 0,0 there is no left or right children.

            this.segArr[segmentIndex] = question[low];

            return this.segArr[segmentIndex];
        }

        int mid = low + (high - low)/2;

        int left = build(low, mid, leftChildrenIndex);
        int right = build(mid + 1, high, rightChildrenIndex);

        //update segment array:
        this.segArr[segmentIndex] = left + right;


        return this.segArr[segmentIndex];


    }

    public int querySum(int low, int high, int queryLeft, int queryRight, int segmentIndex){


        int mid = low + (high - low) / 2;
        
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 9, 2, 5, 6, 7, 8};
        SegmentTree st = new SegmentTree(arr);
    }
}
