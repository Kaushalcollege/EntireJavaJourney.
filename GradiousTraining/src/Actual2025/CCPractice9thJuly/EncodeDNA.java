package Actual2025.CCPractice9thJuly;

public class EncodeDNA {
    public static void main(String[] args) {
        String s = "01001110";

        System.out.println(encodeDNA(s));
    }

    public static String encodeDNA(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i += 2) {
            String pair = s.substring(i, i + 2);

            if (pair.equals("00")) {
                result += "A";
            } else if (pair.equals("01")) {
                result += "T";
            } else if (pair.equals("10")) {
                result += "C";
            } else if (pair.equals("11")) {
                result += "G";
            }
        }

        return result;
    }
}
