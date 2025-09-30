package Actual2025.CCPractice9thJuly;

public class PrintEvenlengthwords {
    public static void main(String[] args) {
        String str = "1234 567 89012 3456";

        System.out.println(EvenLengthWords(str));
    }
    public static String EvenLengthWords (String str){
        String[] words = str.trim().split(" "); 
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        if (word.length() % 2 == 0) {
            result.append(word).append(" ");
        }
    }

    if (result.length() > 0) {
        result.setLength(result.length() - 1);
    }

    return result.toString();
    }
}
