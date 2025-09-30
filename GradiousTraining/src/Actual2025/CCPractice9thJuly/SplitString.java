package Actual2025.CCPractice9thJuly;

public class SplitString {
    public static void main(String[] args) {
        String input = "apple,banana,cherry,date,elderberry,fig,grape";

        System.out.println(splitAndPrint(input));
    }

    public static String splitAndPrint(String input) {
        String[] parts = input.split(",");
        String result = "";

        for (int i = 0; i < parts.length; i++) {
            result += parts[i];
            if (i < parts.length - 1) {
                result += "\n";
            }
        }

        return result;
    }
}
