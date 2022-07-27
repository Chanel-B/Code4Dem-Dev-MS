package com.employee.employee.controller;

import com.employee.employee.model.Employee;
import com.employee.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        Employee employee1 = new Employee();
        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());


        return employeeRepository.save(employee1);
    }

}
