package psumappractice;

import java.util.*;

public class LabPart3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Kelly", "Mary", "666-66-6666");
        Employee e3 = new Employee("Brown", "Julia", "444-44-4444");
        Employee e4 = new Employee("Johnson", "Ray", "111-11-1111");

        Map map = new HashMap(); 
        
        // Use the SSN of the employee as the 'Key' in the map
        // REMEMBER EACH KEY MUST BE UNIQUE!!!!
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);

        // Retrieve a item from the map
        // Cast the map as Employee because no generics were used for
        // map. Map is an object.
        Employee emp1 = (Employee)map.get(e4.getSsn());
        
        System.out.println("Employee 4 with ssn " + e4.getSsn() + " is:");
        System.out.println(emp1);
        System.out.println("");
        
        System.out.println("The map contains the following employees:");
        // Loop through the Map's keys.
        // Keys must be unique so we should use a Set
        // Remember Map is an object.
        Set keys = map.keySet();
        for (Object theKeys : keys){
            Employee emp = (Employee)map.get(theKeys);
            System.out.println(emp);
        }
        
        System.out.println("\nThe values for the map are:");
        // Not retrieve a list of values (Remember that a map contains (key, value)
        // Here we are just retreiving the values. These get stored in a 
        // Collection.
        Collection values = map.values();
        for (Object theValues : values){
            System.out.println(theValues);
        }
        
        // Let's replace employee information in the map.
        // Setup a new Employee object and a object of the old employee
        // Place the new Emplouyee in the map of Employees
        Employee newEmp = new Employee("Humfrees", "Greg", "333-33-3333");
        Employee oldEmp = (Employee)map.get("333-33-3333");
        map.put(oldEmp.getSsn(), newEmp);
        
        System.out.println("\nReplacing " + oldEmp.getFirstName() + " " + 
                oldEmp.getLastName() + " - ssn 333-33-3333 - with " + 
                newEmp.getFirstName() + " " + newEmp.getLastName() + " info.");
        
        // Retreive the map again.
        for (Object theValues : values){
            System.out.println(theValues);
        }
    }
}
