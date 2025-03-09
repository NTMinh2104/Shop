package com.webshop.Demo01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
    
}
