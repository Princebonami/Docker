package com.DockerProject.Dockerproject.service;

import com.DockerProject.Dockerproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public String saveEmployee(Employee employee);
    public Employee getEmployeeById(Integer empId);
    public List<Employee> getAllEmployee();
    public String updateEmployeeById(Employee employee);
}
