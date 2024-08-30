package com.kaushal;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner nigga = new Scanner(System.in);
        int n = nigga.nextInt();
        leftpyramidinv(n);
    }
    public static void leftpyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
/*
    logic:
        We have a nested for loop.
        The parent loop is for the rows and the child loop is for the columns.
        i runs from 0 to n which id the no. of rows.
        j runs from 0 to i.
 */
    public static void leftpyramidinv(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
/*
    logic:
        We have a nested for loop.
        The parent loop is for the rows and the child loop is for the columns.
        i runs from 0 to n which id the no. of rows.
        j runs from n to i+1.---why is that?
        we can see that when i=0, j=n and j starts printing 5 stars, meaning 5,4,3,2,1.
        if we use for (int j = n; j >= i; j--), then j starts printing 6 stars, meaning 5,4,3,2,1,0.
        Hence Proved.
 */
    public static void rightpyramid(int n) {
        
    }
}
