package Arrayskaushal;

public class demo {
    public static void main(String[] args) {
        // store a rollno:
        int rollno1 = 44;

        // store a name:
        String name = "Kaushal Kumar";

        // Store 5 roll nos:
        // then we can go about doing :
        int rollno2 = 45;
        int rollno3 = 46;
        int rollno4 = 47;
        int rollno5 = 48;
        int rollno6 = 49;

        //But this is not a practical approach as when we will be asked to store a 100 roll nos,
        // an additional 100 lines of code is not acceptable.
        /*
        syntax::
        data_type[] var_name = new data_type[sizeofarray];

        or

        data_type[] var_name = {};
         */

//        int[] rollnos = {rollno1, rollno2, rollno3, rollno4, rollno5};
//        // or
//        int[] rollnos2 = new int[5];
        int[] r; // declaration of r array. r is getting defined in the stack.
        r = new int[5]; // initialization: here object is being created in the heap memory.
        // internally it will be [0,0,0,0,0]
        String[] s = new String[5];
        System.out.println(s[0]);// output is null.
        //null is a special literal which can only be assigned to non-primitive references.
    }

}
