package com.shramko.spring.springboot.spring_boot_udemy.service;



import com.shramko.spring.springboot.spring_boot_udemy.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
