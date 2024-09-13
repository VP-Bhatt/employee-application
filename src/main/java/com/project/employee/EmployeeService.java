package com.project.employee;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.Collections.*;

@Component
@Transactional
public class EmployeeService {

     Map<String , Employee> employees = new HashMap<>();

     public String createEmployee(String name){
         Employee employee = new Employee(name);
         employees.put(employee.id, employee);
         return String.valueOf(employee.id);
     }

    public Employee getEmployees(String id){
        return employees.get(id);
    }

    private List<Employee> sortUsingName(String order){
         var listEmployee = new ArrayList<Employee>();
         listEmployee.addAll(employees.values());
         List<Employee> empList = new ArrayList<>();
         empList = empList.stream().sorted(Comparator.comparing(e -> e.name)).toList();
         listEmployee.sort(Comparator.comparing(e -> e.name));
         return listEmployee;
    }

}
