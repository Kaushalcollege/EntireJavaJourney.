package OOPS_1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //why do we need objects and classes?
        //let us assume someone important has asked you to make ds that stores 5 roll nos.
        int[] rollnos = new int[5];
        //let us assume someone important has asked you to make ds that stores 5 names.
        String[] names = new String[5];
        // now what would you do if someone asked you to store "details" of 5 students?
        //those details include 1. Rollno, 2. Name, 3. percentage.

        //then your primary instinct would be to do this:
        // Student[] students = new Student[5];
        //But something like that does not exist.
        //so we create our own datatype.
        Student[] students = new Student[5];

        Student kaushal; // declare reference variable of object of typer Student.
        //let's see what "students" variable points to:

        System.out.println(Arrays.toString(students));
        // if the reference variable is not initialized, it's default value is null. (for objects its null, for primitive it's different.)

        kaushal = new Student();
        //dynamically allocates memory and returns a reference to it. (dynamically means at runtime.)
        kaushal.rollno = "C4";
        kaushal.name = "Kaushal Kumar";
        kaushal.percentage = 9.5F;
        System.out.println(kaushal.rollno + " " + kaushal.name + " " +   kaushal.percentage);

        Student nishant;
        //System.out.println(nishant.rollno + " " + nishant.name + " " +   nishant.percentage); -- this gives an error

        nishant = new Student();
        System.out.println(nishant.rollno + " " + nishant.name + " " +   nishant.percentage);
    }
    static class Student{
        String rollno;
        String name;
        float percentage;
    }
    //Class is a logical construct.
    //Object is a physical entity(in memory) -- occupies space in memory.
    //class is used to create a data type.
    // 3 properties of objects:
    /*
    1. State of the Object.
    2. Identity of the Object.
    3. Behaviour of the Object.
     */
    // variables inside objects are called instance variable.
    // we access them using the dot operator.
}
