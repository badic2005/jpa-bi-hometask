package com.telran.jpabihometask.controller;

import com.telran.jpabihometask.dto.EmployeeRequest;
import com.telran.jpabihometask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Boolean addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.addEmployee(employeeRequest);
    }

    @GetMapping("/company/{companyId}")
    public List<String> getEmloyees(@PathVariable Long companyId) {
        return employeeService.getEmployees(companyId);
    }
}
