package RecursionGradiousDSA5;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        per("", str);
    }

    public static void per(String k, String str) {
        if (str.length() == 0) {
            System.out.println(k);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            per(k + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }
}
