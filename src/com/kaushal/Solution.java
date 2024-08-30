package com.kaushal;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = Lasttwodigits(n);
        System.out.println(k);
    }
    public static int Lasttwodigits(int n) {
        int r = n%100;
        return r;
    }
}
