package com.webshop.Demo01.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.Demo01.Model.Order;
import com.webshop.Demo01.Model.OrderStatus;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(OrderStatus status);
}
