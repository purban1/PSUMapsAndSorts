package psumappractice;

import java.util.*;

public class LabPart5 {

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
        Employee e5 = new Employee("Wilson", "Gloria", "111-11-1111");

        Employee[] employeeArray = {e1, e2, e3, e4, e5};
        
        Set empSet = new TreeSet();

        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        empSet.add(e5);

        System.out.println("Before sorting, the 5 employees were as follows:");
        for (Employee e : employeeArray){
            System.out.println(e);
        }
        
        List empList = new ArrayList(empSet);
        
        // Output results. It should be sorted by SSN.
        // Save the keys in a Set.
        System.out.println("\nUsing the TreeSet, the employees are now:");
        
        Iterator itr = empSet.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        Collections.sort(empList, new EmployeeByLastName());
        
        itr = empList.iterator();
        
        System.out.println("\nHere are the employees sorted by last name:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
