package Actual2025.Hashing;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swisss";
        HashMap<Character, Integer> puneeth = new HashMap<>();
        for (char c : s.toCharArray()) {
            // int f = puneeth.getOrDefault(c, 0);
            // puneeth.put(c, f + 1);
            puneeth.put(c, puneeth.getOrDefault(c, 0) + 1);
        }
        System.out.println(puneeth);
        for (char c : puneeth.keySet()) {
            if (puneeth.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
