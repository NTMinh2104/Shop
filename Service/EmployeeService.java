package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.DTO.EmployeeDto;
import com.webshop.Demo01.Model.Employee;
import com.webshop.Demo01.Model.Role;
import com.webshop.Demo01.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;
    
    // Danh sach all nvien (dto)
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map((Employee emp) -> modelMapper.map(emp, EmployeeDto.class))
                .collect(Collectors.toList());
    }
    
    // Thong tin nvien theo id (entity)
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
    
    // add tai khoan nvien moiw
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        employee.setPassword("defaultPassword");
        Employee saved = employeeRepository.save(employee);
        return modelMapper.map(saved, EmployeeDto.class);
    }
    
    // update tt nvien
    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedDto) {
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        if(optEmployee.isPresent()){
            Employee employee = optEmployee.get();
            employee.setName(updatedDto.getName());
            employee.setEmail(updatedDto.getEmail());
            // Cập nhật role (chuyển từ String sang enum)
            employee.setRole(Role.valueOf(updatedDto.getRole()));
            Employee saved = employeeRepository.save(employee);
            return modelMapper.map(saved, EmployeeDto.class);
        }
        return null;
    }
    
    // delete nv
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
