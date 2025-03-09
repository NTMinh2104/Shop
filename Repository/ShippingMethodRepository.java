package com.webshop.Demo01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.ShippingMethod;

public interface ShippingMethodRepository extends JpaRepository<ShippingMethod, Long> {
    
}
