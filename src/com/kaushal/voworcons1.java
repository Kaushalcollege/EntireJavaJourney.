package com.kaushal;

import java.util.Scanner;

public class voworcons1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        System.out.println(voworconsa(letter));
    }
    public static String voworconsa(String letter) {
        char ch = letter.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
            {
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }
        else
        {
            return "Other";
        }
    }
}
