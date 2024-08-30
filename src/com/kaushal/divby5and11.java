package com.kaushal;

import java.util.Scanner;

public class divby5and11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean k = divby5andd11(n);
        System.out.println(k);
    }
    public static boolean divby5andd11(int n) {
        if (n%5 == 0 && n%11 == 0) {
            return true;
        }
        return false;
    }
}
