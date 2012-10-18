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

        Map map = new TreeMap(); 
        
        // Use the SSN of the employee as the 'Key' in the map
        // REMEMBER EACH KEY MUST BE UNIQUE!!!!
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);

    }
}
