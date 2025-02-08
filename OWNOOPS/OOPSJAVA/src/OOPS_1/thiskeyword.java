package OOPS_1;
// Continuation of Demo class.

public class thiskeyword {
    public static void main(String[] args) {
        //Let us say that we have to add all the attributes relating to the class in one function.
        // you want to pass the stuff, during initialization.
        // ex) Student kaushal = new Student("C4", "Kaushal Kumar", 98.6);
        // how exactly would you do this?
        //Student s1 = new Student();// Student(), this is called the default constructor.
        // but we need a constructor -- Student("C4", "Kaushal Kumar", 98.6).
        /*
        Constructor is a function that runs when you create an object and allocate some values to the instance variables.
         */
        //we have to use "this" keyword -- analogous to "self" keyword in python.

        Student kaushal = new Student("C4", "Kaushal Kumar", 98.6F);
        System.out.println(kaushal.rno + " " + kaushal.name + " " + kaushal.percentage);
    }
    static class Student{
        String rno;
        String name;
        float percentage;
        // we need a way to add the values of the above properties / attributes -- object  after object.
        // we need a specific word to do this.

        Student(String rno, String name, float percentage){
            this.rno = rno;
            this.name = name;
            this.percentage = percentage;
        }
    }
}
