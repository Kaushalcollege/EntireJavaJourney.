package com.kaushal;

import java.util.Scanner;

public class tenthplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = tenthplace1(n);
        System.out.println(k);
    }
    public static int tenthplace1(int n) {
        int r = n%100;
        r /=10;
        return r;
    }
}
