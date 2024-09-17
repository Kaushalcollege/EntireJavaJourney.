package Arrayskaushal;

import java.util.Arrays;

public class passinginfuncs {
    public static void main(String[] args) {
        int[] hehe = {1,2,3,4,5};
        System.out.println(Arrays.toString(hehe));
        changevalue(hehe);
        System.out.println(Arrays.toString(hehe));
    }
    static void changevalue (int[] arr){
        arr[0]= 56789;
    }
}
