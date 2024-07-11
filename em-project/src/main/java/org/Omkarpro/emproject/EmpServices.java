package org.Omkarpro.emproject;

import java.util.List;

public  interface  EmpServices {

    String CreateEmployee(Employee employee);
    List<Employee> ReadEmployees();
    boolean DeleteEmployee(long id );
}
