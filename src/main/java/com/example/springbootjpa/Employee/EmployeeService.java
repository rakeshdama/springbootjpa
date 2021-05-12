package com.example.springbootjpa.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    List<Employee> employees = new ArrayList<>();

    public void createStudent(){
        employees.add(new Employee(111, "rakesh", "Pentester", "100000$"));
        employees.add(new Employee(112, "dama", "hacker", "110000$"));
        employees.add(new Employee(113, "royal", "Soc Analyst", "120000$"));
    }

    public List<Employee> getEmployees() {
//        createStudent();
//        return employees;
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployee(int id) {
            return employeeRepository.findById(id).get();

        }
}
