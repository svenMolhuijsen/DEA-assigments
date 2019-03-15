package nl.han.ica.oose;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public  List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDb);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewi", "Solo", "Han", "han@solo.com");
        EmployeeCSV employeeFromCsv = new EmployeeCSV(1, "Wick", "John", "john@wick.com");

        employees.add(new employeeAdapterCSV(employeeFromCsv));
        employees.add(new employeeAdapterLdap(employeeFromLdap));

        return employees;
    }
}
