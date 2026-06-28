package com.application.controller;

import com.application.model.Employee;
import com.application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/details")
    public String getEmployeeDetails() {
        return employeeService.getEmployeeDetails();
    }

    // Save Employee
    @PostMapping(value = "/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

}
