package com.webshop.Demo01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    
}
