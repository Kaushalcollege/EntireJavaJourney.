package Revision2025_start.arrays;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String roman = convertToRoman(num);
        System.out.println(roman);
    }

    public static String convertToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
