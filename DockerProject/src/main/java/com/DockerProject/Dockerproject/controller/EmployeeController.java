package com.DockerProject.Dockerproject.controller;

import com.DockerProject.Dockerproject.entity.Employee;
import com.DockerProject.Dockerproject.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee)
    {
        return	employeeServiceImpl.saveEmployee(employee);
    }

    @GetMapping("/get/{empId}")
    public Employee getEmployeeById( @PathVariable("empId") Integer empId)
    {
        return employeeServiceImpl.getEmployeeById(empId);
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployee()
    {
        return employeeServiceImpl.getAllEmployee();
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee)
    {
        return employeeServiceImpl.updateEmployeeById(employee);
    }
}
