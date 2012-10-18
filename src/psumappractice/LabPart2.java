package psumappractice;

import java.util.*;

public class LabPart2 {

    /**
     * Next, initialize four Employee objects, but this time make sure at least 
     * two have the same social security number. Now add them to a HashSet. 
     * Then loop through the HashSet and verify that only two employees can be 
     * printed out because the duplicate (last item that matches) has been 
     * removed. Now pass the Set to a List constructor and verify that your 
     * list contains the transformed Set.
     */
    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Kelly", "Mary", "666-66-6666");
        Employee e3 = new Employee("Brown", "Julia", "333-33-3333");
        Employee e4 = new Employee("Johnson", "Ray", "111-11-11114");

        // Create an array of Employees
        Employee[] employees = {e1, e2, e3, e4};

        // Sort the employees by SSN. REMEMBER THAT COMPARABLE MUST BE 
        // IMPLEMENTED IN THE EMPLOYEE CLASS
        Arrays.sort(employees);

        System.out.println("\nThe employees Array of all employees is:");
        
        // Output all Employees
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("\nHere is the list with duplicate ssn removed:");
        
        // Create HashSet -- Because Employee has the HashCode, Equals and 
        // compareTo (with ssn specifically stated) methods, the HashSet will 
        // remove duplicate SSNs. Generics (< >) used to avoid casting later
        // and using a non Enhanced For Loop
        Set<Employee> employ = new HashSet<Employee>();

        // add employee objects to the Set
        employ.add(e1);
        employ.add(e2);
        employ.add(e3);
        employ.add(e4);

        // Create enhanced For Loop to loop through results
        for (Employee e : employ) {
            System.out.println(e);
        }

        List<Employee> list = new ArrayList<Employee>(employ);

        System.out.println("\nThe size of the Employee List is now "
                + list.size() + ".");

        // Create enhanced For Loop to loop through results
        for (Employee e : list) {
            System.out.println(e);
        }

        // Get a the 2nd Member of the list using toString
        System.out.println("\nThe second member in the list is: \n"
                + list.get(1) + "\n");

        // Or get just the first name
        System.out.println("The first name of the 2nd member in the list is "
                + list.get(1).getFirstName() + ".\n");


    }
}
