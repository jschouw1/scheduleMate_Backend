package com.jschouw.scheduleMate.controller;

import com.jschouw.scheduleMate.model.Employee;
import com.jschouw.scheduleMate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    @Autowired private EmployeeService employeeService;

    @PostMapping("/registerEmployee")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }



}
