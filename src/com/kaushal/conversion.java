package com.kaushal;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner nigga = new Scanner(System.in);
        int n = nigga.nextInt();
        System.out.println(dateconversion(n));
    }
    public static String dateconversion(int n) {
        int years = 0;
        int weeks = 0;
        int days = 0;
        years = n / 365;
        weeks = (n%365)/7;
        days = (n%365)%7;
        return years + " years, " + weeks + " weeks and " + days + " days.";
    }
}
