package psumappractice;

import java.util.*;

public class LabPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Kelly", "Mary", "666-66-6666");
        Employee e3 = new Employee("Brown", "Julia", "333-33-3333");
        Employee e4 = new Employee("Johnson", "Ray", "111-11-11114");
        
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
        for(Employee e : employ){
            System.out.println(e);
        }
        
        System.out.println();
        
        List<Employee> list = new ArrayList<Employee>(employ);
        
        // Create enhanced For Loop to loop through results
        for(Employee e : list){
            System.out.println(e);
        }
    }
}
