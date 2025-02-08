package StringsinTrainings;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(mostFrequentChar(s));
    }

    static char mostFrequentChar(String str) {
        int[] freq = new int[256];  // Array to store frequency of each character

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the character with the maximum frequency
        char mf = str.charAt(0);
        int mc = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > mc) {
                mf = str.charAt(i);
                mc = freq[str.charAt(i)];
            }
        }

        return mf;
    }
}
