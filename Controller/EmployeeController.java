package com.webshop.Demo01.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.Model.Employee;
import com.webshop.Demo01.Service.EmployeeService;

@RestController
@RequestMapping("/admin/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    // Lay ds tat ca thanh vien
    @GetMapping
    public List<Employee> listEmployees() {
        return employeeService.getAllEmployees();
    }
    
    // Lay thong tin nhan vien theo id
    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
    
    // Tao tk nvien moi
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    
    // Cap nhat tt nhanvien
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee updated = employeeService.updateEmployee(id, employee);
        if(updated == null) {
            throw new RuntimeException("Employee not found");
        }
        return updated;
    }
    
    // Xoa tk nhan vien
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
