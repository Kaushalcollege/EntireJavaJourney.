package RecursionGradiousDSA5;

import java.util.Scanner;

public class AllpossibleSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sub("", str);
    }
    public static void sub(String str, String sub) {
        if (str.length() <= 0) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                sub(str + str.charAt(i), sub.substring(i + 1, j));
            }
        }
    }
}
