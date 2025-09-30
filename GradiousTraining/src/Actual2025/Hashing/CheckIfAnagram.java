package Actual2025.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "cat";
        String s2 = sc.nextLine();
        sc.close();

        if (s1.length() != s2.length()) {
            System.out.println("false");
            return; // Exit the program early if lengths do not match
        }

        HashMap<Character, Integer> anagramChecker = new HashMap<>();

        // Count character occurrences in s1
        for (char c : s1.toCharArray()) {
            anagramChecker.put(c, anagramChecker.getOrDefault(c, 0) + 1);
        }

        // Decrease count for characters in s2
        for (char c : s2.toCharArray()) {
            if (!anagramChecker.containsKey(c) || anagramChecker.get(c) == 0) {
                System.out.println("false");
                return;
            }
            anagramChecker.put(c, anagramChecker.get(c) - 1);
        }

        System.out.println("true"); // If all characters match, it's an anagram
    }
}
