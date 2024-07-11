package org.Omkarpro.emproject;

import java.util.ArrayList;
import java.util.List;

public class EmpServicesImp implements EmpServices {

    List<Employee> employees = new ArrayList<>();
    @Override
    public String CreateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        employees.add(employee);
        return "Save Succesfully";
    }

    @Override
    public List<Employee> ReadEmployees() {
        return employees;
        // TODO Auto-generated method stub
    }

    @Override
    public boolean DeleteEmployee(long id) {

        employees.remove(id);
        return true;
        // TODO Auto-generated method stub
    }

}
