package Actual2025.CCPractice9thJuly;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(countWords(str));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
