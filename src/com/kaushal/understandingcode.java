package com.kaushal;

public class understandingcode {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
// What am I doing here?
/* So, the First line of the code "public class understandingcode{}" ---
        1. public-- This is an access modifier, which means that the understandingcode class is accessible from any other class.
        It's making the class available to other parts of the program or other programs.
        2. class-- This keyword is used to define a new class in Java. A class is a blueprint for objects.
         It can contain fields (variables) and methods (functions) that define the behavior of the objects created from the class.
         Second line of code "public static void main(String[] args){}" ---
         public: This is an access modifier that allows the main method to be called from outside the class.
         This is necessary because the Java Virtual Machine (JVM) needs to access this method to run the program.

        static: This keyword means that the method belongs to the class rather than an instance of the class.
        This allows the JVM to call the main method without creating an instance of the class.
        In simpler terms, static methods can be called without creating an object of the class.

        void: This keyword indicates that the method does not return any value.
        The main method is the entry point of the program, so it doesn't need to return anything.

        main: This is the name of the method.
        The main method is special in Java; it's the entry point where the program begins execution.

        String[] args: This is the parameter to the main method.
         String[] indicates an array of String objects.
          args is the name of the array (you can name it anything, but args is the convention).
          These are command-line arguments passed to the program when it is executed.
          If you run the program with arguments, they will be available in this array.
          basically, command line arguments are string arguments which the main method reads and stores.


          If I pass this command after the compilation of the file "java understandingcode 'God is Great'",
          then the args[0]='God is Great' will get stored.
 */