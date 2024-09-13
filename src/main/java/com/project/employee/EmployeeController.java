package com.project.employee;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @Resource
    EmployeeService employeeService ;
//    Create below Rest endpoints
//    1) Create a new employee
//    2) Update an existing employee
//    3) Delete an employee
//    4) Get a specific employee details
//    5) Get a list of employee details - Needs to implement sorting based on the input. Lets say fetch all employees in a department
//3) Think of what validations you can put in place and is there any framework api's we can use out of the box.
    @PostMapping(path = "/{name}")
    public String createEmployee(
            @PathVariable(name = "name")String name
    ){
        return employeeService.createEmployee(name);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployees(
            @PathVariable(name = "id")String id
    ){
        return employeeService.getEmployees(id);
    }


//    @PutMapping(path = "/update")
//    public void updateEmployee(){
//
//    }
}
