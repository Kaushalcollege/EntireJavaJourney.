package Actual2025.HashingAssignment2;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(Arrays.deepToString(groupAnagramChecker(words)));
    }

    public static String[][] groupAnagramChecker(String[] words) {
        if (words == null || words.length == 0) {
            return new String[0][0];
        }

        Map<String, List<String>> anagramMap = new LinkedHashMap<>();

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        String[][] result = new String[anagramMap.size()][];
        int index = 0;

        for (List<String> group : anagramMap.values()) {
            result[index++] = group.toArray(new String[0]);
        }

        return result;
    }
}
