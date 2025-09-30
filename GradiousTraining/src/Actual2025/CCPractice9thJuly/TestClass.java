package Actual2025.CCPractice9thJuly;

public class TestClass {
    public static int convertRoman(String romanNumeral) {
        java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int current = romanMap.get(romanNumeral.charAt(i));

            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }

            prevValue = current;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.print(convertRoman(args[0]));
    }
}
