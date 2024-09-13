package com.project.employee;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Employee {

    String name;
    @NonNull
    String id;

    int salary;

    double phoneNumber;

    public Employee(String name){
        this.name = name;
        this.id = String.valueOf(Math.random()) ;
        this.salary = 1000;
        this.phoneNumber = Math.random();
    }

}
