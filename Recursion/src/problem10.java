import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; //initializing array.
        System.out.println("Enter marks of 5 students: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The marks are: ");
        for (int j : arr)
        {
            System.out.println(j + " ");
        }
        System.out.println("The average of the 5 students is:" + avg(arr));
        System.out.println("The count of students who passed is:" + count(arr));
        for (int j : doubling(arr))
        {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(verfication(arr));
    }
    public static double avg(int[] arr) {
        double avg = 0;
        for (int i : arr)
        {
            avg += i;
        }
        return avg / arr.length;
    }
    public static int count(int[] arr) {
        int count1 = 0;
        for (int i : arr)
        {
            if (i >= 70)
            {
                count1++;
            }
        }
        return count1;
    }
    public static int[] doubling(int[] arr) {
        int[] Arr = arr.clone();
        for (int i = 0; i < arr.length; i++)
        {
            Arr[i] = Arr[i] * 2;
        }
        return Arr;
    }
    public static boolean verfication(int[] a) {
        boolean verfication = false;
        for (int i : a)
        {
            if ( i > 70){
                verfication = true;
                break;
            }

        }

        return verfication;
    }
}
