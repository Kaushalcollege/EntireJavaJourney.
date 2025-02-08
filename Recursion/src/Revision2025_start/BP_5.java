package Revision2025_start;

import java.util.Scanner;

public class BP_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int years = days/365;
        int weeks = (days % 365)/7;
        int remdays = (days % 365)%7;
        System.out.println(years + " years " + weeks + " weeks " + remdays + " days.");
    }
}
