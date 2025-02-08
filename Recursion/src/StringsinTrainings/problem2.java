package StringsinTrainings;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String d = new String();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            d = d + chars[chars.length - 1 - i];
        }
        if (s.equals(d)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
