package Actual2025.Quee;

import java.util.*;

public class dsaq1 {
    public static int[] generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        List<String> l = new ArrayList<>();

        while (l.size() < n) {
            String temp = q.poll();
            l.add(temp);
            q.add(temp + "0");
            q.add(temp + "1");
        }

        int[] arr = new int[l.size()];
        int idx = 0;
        for (String s : l) {
            arr[idx++] = Integer.parseInt(s);
        }

        return arr;
    }

    // Updated main method to take user input using Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Arrays.toString(generateBinaryNumbers(n)));
        sc.close();
    }
}
