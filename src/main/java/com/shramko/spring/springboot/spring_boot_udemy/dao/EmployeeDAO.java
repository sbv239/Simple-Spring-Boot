package com.shramko.spring.springboot.spring_boot_udemy.dao;

import com.shramko.spring.springboot.spring_boot_udemy.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
