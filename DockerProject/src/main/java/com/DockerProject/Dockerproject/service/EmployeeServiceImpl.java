package com.DockerProject.Dockerproject.service;

import com.DockerProject.Dockerproject.entity.Employee;
import com.DockerProject.Dockerproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public String saveEmployee(Employee employee) {

        employeeRepository.save(employee);
        return "Employee details has registered";
    }

    @Override
    public Employee getEmployeeById(Integer empId) {

        Employee employee=  employeeRepository.findById(empId).get();
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> employees=	employeeRepository.findAll();
        return employees;
    }

    @Override
    public String updateEmployeeById(Employee employee) {

        employeeRepository.save(employee);
        return "The employee details gets updated sucessfully";
    }
}
