package Arrayskaushal;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        //How do we even work with it?
        // Generic is the type of data that we are storing in the ArrayList.

        //And what is that Integer class? why are we using it instead of the 'int' keyword?
        /*
        The 'Integer' 'class' wraps a 'value' of the primitive type int in an "object".
         An object of type Integer contains a single field whose type is int.
        In addition, this class provides several methods for converting an int to a String and a String
        to an int, as well as other constants and methods useful when dealing with an int.
        This is a value-based class; programmers should treat instances that are equal as interchangeable
         and should not use instances for synchronization, or unpredictable behavior may occur.
         For example, in a future release, synchronization may fail
         */
//        list.add(69);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//        list.add(120);
//        list.add(130);
//        list.add(140);
//        list.add(150);
//        list.add(160);
//        list.add(170);
//        System.out.println(list);
//        list.set(0, 6969);
//        list.remove(4);
//        System.out.println(list);
        // a lot of cool stuff can be done with this, just type list and . you will be getting huge
        // number of list functions to choose from.
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass the index here, list[index] will not work here.
        }
        System.out.println(list);



        // The use of ArrayLists is for dynamic array utility.
        // in C we use the malloc(), calloc() etc.
    }
}
