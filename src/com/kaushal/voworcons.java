package com.kaushal;

import java.util.Scanner;

public class voworcons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char n = in.next().charAt(0);
        boolean k = voworcons1(n);
        if(k == true)
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
    public static boolean voworcons1(char n) {
        if (n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
        {
            return true;
        }
        return false;
    }
}
