package com.example.employee.service;

import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.model.EmployeeRowMappper;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.server.ResponseStatusException;
import java.util.*;

@Service
public class EmployeeH2Service implements EmployeeRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Employee> getEmployees() {
        List<Employee> employeeList = db.query("SELECT * FROM EMPLOYEELIST", new EmployeeRowMapper());
        ArrayList<Employee> employees = new ArrayList<>(employeeList);
        return employees;
    }

    @Override
    public Employee getEmployeeId(int employeeId) {
        return new Employee(1, "John Doe", "johndoe@example.com", "Marketing");
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return new Employee(1, "John Doe", "johndoe@example.com", "Marketing");

    }

    @Override
    public Employee updateEmployee(int employeeId, Employee employee) {
        return new Employee(1, "John Doe", "johndoe@example.com", "Marketing");

    }

    @Override
    public void deleteEmployee(int employeeId) {

    }

}
