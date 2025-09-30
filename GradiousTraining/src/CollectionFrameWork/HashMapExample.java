package CollectionFrameWork;

import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        HashMap employeeInfo = new HashMap();
        HashMap contactInfo = new HashMap();
        employeeInfo.put(1, "Raja");
        employeeInfo.put(2, "Gouthami");
        employeeInfo.put(3, "Heyansh");
        employeeInfo.put(4, "Yamini");
        employeeInfo.put(5, "ManuTej");

        System.out.println("Employee Information\n" + employeeInfo);
        System.out.println("\nPlease enter the ID and Contact number");
        System.out.println("Employee IDs : " + employeeInfo.keySet());
        System.out.print("Enter ID: ");
        int id = read.nextInt();
        System.out.print("Enter Contact Number: ");
        long contactNo = read.nextLong();
        if(employeeInfo.containsKey(id)) {
            contactInfo.put(id, contactNo);
        }
        System.out.println("\n\nEmployee Contact Information\n");
        System.out.println("ID - " + id);
        System.out.println("Name - " + employeeInfo.get(id));
        System.out.println("Contact Number - " + contactInfo.get(id));
    }
}