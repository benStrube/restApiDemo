package com.strube.RestApiDemo.Repositories;

import com.strube.RestApiDemo.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
    
}
