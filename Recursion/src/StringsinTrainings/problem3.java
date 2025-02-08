package StringsinTrainings;

import java.util.Scanner;

// Program to check if a sentence is a palindrome
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        // Remove all whitespace characters and convert to lowercase for case-insensitive comparison
        String cleaned = s.replaceAll("\\s", "").toLowerCase();

        // Reverse the cleaned string using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare the cleaned string with its reverse
        if (cleaned.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
