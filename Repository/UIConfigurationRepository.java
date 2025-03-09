package com.webshop.Demo01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.UIConfiguration;

public interface UIConfigurationRepository extends JpaRepository<UIConfiguration, Long> {
    
}
