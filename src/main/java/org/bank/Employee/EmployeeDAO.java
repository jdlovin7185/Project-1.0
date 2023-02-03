package org.bank.Employee;

import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee employeeLogin(int id);
    List<Employee> getEmployees();

    Employee employeeById(int id);

}
