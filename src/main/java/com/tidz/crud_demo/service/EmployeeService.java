package com.tidz.crud_demo.service;

import com.tidz.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
