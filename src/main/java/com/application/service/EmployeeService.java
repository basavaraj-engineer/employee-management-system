package com.application.service;

import com.application.Repository.EmployeeRepository;
import com.application.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String getEmployeeDetails(){
        return "Employee details returned successfully";
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeData(int employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }
}
