package com.telran.jpabihometask.service;

import com.telran.jpabihometask.dto.EmployeeRequest;

import java.util.List;

public interface EmployeeService {
    Boolean addEmployee(EmployeeRequest employeeRequest);

    List<String> getEmployees(Long companyId);
}
