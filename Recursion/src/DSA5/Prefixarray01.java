package DSA5;

import java.util.Scanner;

public class Prefixarray01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(rev(s));
    }
    public static String rev(String s) {
        if (s.length() <= 1) return s;
        return rev(s.substring(1)) + s.charAt(0);
    }
}
