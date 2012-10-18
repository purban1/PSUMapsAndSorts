package psumappractice;

import java.util.*;

public class LabPart4 {

    /**
     * Store the same four Employee objects in a TreeMap. Demonstrate that
     * sorting works. Did you remember to override compareTo() from the
     * Comparable interfaces? Now try using a Comparator from the
     * GenericsAndMaps project (remember you'll need a utility class).
     */
    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Kelly", "Mary", "666-66-6666");
        Employee e3 = new Employee("Brown", "Julia", "444-44-4444");
        Employee e4 = new Employee("Johnson", "Ray", "111-11-1111");

        Employee[] employeeArray = {e1, e2, e3, e4};
        
        Map map = new TreeMap();

        // Use the SSN of the employee as the 'Key' in the map
        // REMEMBER EACH KEY MUST BE UNIQUE!!!!
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);

        System.out.println("Before sorting, the employee order was as follows:");
        for (Employee e : employeeArray){
            System.out.println(e);
        }
        
        // Output results. It should be sorted by SSN.
        // Save the keys in a Set.
        System.out.println("\nThe sorted map (sorted by ssn) looks like this:");
        
        Set keys = map.keySet();
        for (Object theKeys : keys) {
            Employee foundEmp = (Employee)map.get(theKeys);
            System.out.println(foundEmp);
        }
        
        // Now sort the array using the comparitor (Utility class)
        // Pass the array and an instance of the Utility class
        Arrays.sort(employeeArray, new EmployeeByLastName());
        
        System.out.println("\nThe sorted Array (by Last name) looks like this:");
        
        // retreive the array
        for (Employee e : employeeArray){
            System.out.println(e);
        }
        
         System.out.println("\nNow we take the map and store the values in a "
                 + "collection, which we then");
         System.out.println("convert to a List. Collections.sort requires that a"
                 + "list be used.");
        // The Utility class can also be used on a Collection
        // The map needs to be placed in a List which is what a Collection.sort
        // requires.
        Collection<Employee> values = map.values();
        List<Employee> employeeList = new ArrayList<Employee>(values);
        Collections.sort(employeeList, new EmployeeByFirstName());
        for (Employee e : employeeList){
            System.out.println(e);
        }
        
        
    }
}
