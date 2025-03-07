package com.webshop.Demo01.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}
