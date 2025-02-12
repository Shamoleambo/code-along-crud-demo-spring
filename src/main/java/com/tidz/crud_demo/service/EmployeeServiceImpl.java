package com.tidz.crud_demo.service;

import com.tidz.crud_demo.dao.EmployeeDAO;
import com.tidz.crud_demo.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
