package Actual2025.CCPractice9thJuly;

import java.util.Arrays;

public class Rotatetheelementsinthegivenarraytowardstheleftfor1position {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(new Rotatetheelementsinthegivenarraytowardstheleftfor1position().rotateElement(arr)));
    }

    public int[] rotateElement (int arr[]){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
