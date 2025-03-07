package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.Model.Employee;
import com.webshop.Demo01.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    // Danh sach all nvien
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    // Thong tin nvien theo id
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
    
    // add tai khoan nvien moiw
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    // update tt nvien
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setPassword(updatedEmployee.getPassword());
            employee.setRole(updatedEmployee.getRole());
            return employeeRepository.save(employee);
        }).orElse(null);
    }
    
    // delete nv
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
