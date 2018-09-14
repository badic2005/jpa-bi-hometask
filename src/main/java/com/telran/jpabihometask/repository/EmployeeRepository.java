package com.telran.jpabihometask.repository;

import com.telran.jpabihometask.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.company.id = :companyId")
    List<Employee> getEmployees(@Param("companyId") Long companyId);
}
