package Actual2025;

import java.util.Scanner;
// trail 1.
public class Seventeenthterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder ii = new StringBuilder();
        int i = 0, j = 0;
        while (N >= 0) {
            ii.append(i).append(",").append(j).append(",");
            i = i + 3;
            j = j + 2;
            N--;
        }
        if (ii.length() > 0){
            ii.setLength(ii.length() - 1);
        }
        String s = ii.toString();
        System.out.println(s);
        System.out.println(term(s, M+1));
    }
    public static int term(String s, int m){
        char[] c = s.toCharArray();
        return c[m];
    }
}
