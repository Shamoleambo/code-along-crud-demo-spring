package com.tidz.crud_demo.dao;

import com.tidz.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
