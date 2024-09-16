package Arrayskaushal;
import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // from this we can conclude that the main method is actually taking a String array as argument.
        /*
        normal input:
         */
        int[] a = new int[5];
        a[0] = 23;
        a[1] = 24;
        a[2] = 25;
        a[3] = 26;
        a[4] = 27;
        System.out.println(a[3]);
        // internally this is how it's stored {23,24,25,26,27}
        //Using For loops.
        for (int j : a) {
            System.out.print(j + "\t");
        }
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int j : b) // This right here is called the advanced for loop.
        {
            System.out.print(j + "\t");
        }
        int[] c = new int[5];
        for (int k : c) {
            c[k] = sc.nextInt();
        }
        for (int k : c){
            System.out.print(k + "\t");
        }
        /*
        In Java, the enhanced for loop (also known as the "for-each" loop) is a simpler
        and more concise way to iterate over arrays or collections compared to using a traditional for loop.
         It eliminates the need for an explicit iterator or index variable, making the code cleaner.
            The syntax for the enhanced for loop is:
            for (Type element : collection) {
                // Use the element
                }
Type: is the type of elements in the collection or array.
element: is a variable that represents each individual item in the collection or array.
collection: is the array or collection to be iterated over.
Read-Only: The enhanced for loop is useful when you only need to read the elements and not modify them.
If you need to modify elements, you'll need to use a traditional for loop or an iterator.
Index Not Available: You cannot get the index of the current element directly in the enhanced for loop.
If you need the index, you should use a traditional for loop.
Iterable Requirements:
The enhanced for loop can be used with any object that implements Iterable, which includes arrays and most collections like List, Set, and Queue.
         */
    }
}
