package psumappractice;

import java.util.Comparator;

/**
 * This Comparator implementation offers an alternate way to sort
 * Employee entities -- by LastName
 * 
 * @author jlombardo
 */
public class EmployeeByFirstName implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}
