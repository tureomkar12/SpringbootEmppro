package org.Omkarpro.emproject;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {
//Depandancy injection

//EmpServicesImp empServices;
    EmpServicesImp empServices = new EmpServicesImp();
    
    //List<Employee> employees = new ArrayList();
    @GetMapping("Employees")
    public List<Employee> GetAllEmployees() {
        Employee emp= new Employee();
        return empServices.ReadEmployees();
    }
    

    @PostMapping("Employees")
    public String createEmployee(@RequestBody Employee employee) {
        //TODO: process POST request
       // employees.add(employee);
       
        return empServices.CreateEmployee(employee);
    }
    @DeleteMapping("Employees/{id}")

    public String deleteEmployee(@PathVariable Long id){
        if(empServices.DeleteEmployee( id))
            return  "Employee Delete Succesfully";
        
        else
        return "no Record found ";

    }

    
    

}
