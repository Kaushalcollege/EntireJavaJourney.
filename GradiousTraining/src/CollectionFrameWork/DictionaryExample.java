package CollectionFrameWork;

import java.util.*;
public class DictionaryExample {
    public static void main(String args[]) {

        Dictionary dict = new Hashtable();

        dict.put(1, "Rama");
        dict.put(2, "Seetha");
        dict.put(3, "Heyansh");
        dict.put(4, "Varshith");
        dict.put(5, "Manutej");

        System.out.println("Dictionary\n=> " + dict);
        // keys()
        System.out.print("\nKeys in Dictionary\n=> ");
        for (Enumeration i = dict.keys(); i.hasMoreElements();)
        {
            System.out.print(" " + i.nextElement());
        }
        // elements()
        System.out.print("\n\nValues in Dictionary\n=> ");
        for (Enumeration i = dict.elements(); i.hasMoreElements();)
        {
            System.out.print(" " + i.nextElement());
        }

        //get()
        System.out.println("\n\nValue associated with key 3 => " + dict.get(3));
        System.out.println("Value associated with key 30 => " + dict.get(30));

        //size()
        System.out.println("\nDictionary has " + dict.size() + " elements");

        //isEmpty()
        System.out.println("\nIs Dictionary empty? " + dict.isEmpty());
    }
}