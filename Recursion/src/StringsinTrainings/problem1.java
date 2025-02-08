package StringsinTrainings;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char c = input.nextLine().charAt(0); // there is no nextChar() method.
        //Using Method.
        System.out.println(charFrequency(s, c));
    }
    static int charFrequency(String s, char c) {
        int i = 0;
        // Using Loop.
        char[] hey = s.toCharArray();
        for (char j : hey){
            if(j ==c){
                i++;
            }
        }
        return i;
    }
}
