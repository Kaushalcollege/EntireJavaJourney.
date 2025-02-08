package Revision2025_start.arrays;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int count = 0; count < s.length(); count++) {
            int c = getval(chars[count]);
            int n = (count + 1 < chars.length) ? getval(chars[count + 1]) : 0;

            if (c < n) {
                sum += (n - c);
                count++;
            } else {
                sum += c;
            }
        }
        System.out.println(sum);
    }
    public static int getval(char c){
        if ( c == 'I'){
            return 1;
        }
        if ( c == 'X'){
            return 10;
        }
        if ( c == 'L'){
            return 50;
        }
        if ( c == 'C'){
            return 100;
        }
        if ( c == 'D'){
            return 500;
        }
        if ( c == 'M'){
            return 1000;
        }
        if ( c == 'V'){
            return 5;
        }
        return 0;
    }
}
