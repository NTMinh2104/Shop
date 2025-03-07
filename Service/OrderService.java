package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.Model.Order;
import com.webshop.Demo01.Model.OrderStatus;
import com.webshop.Demo01.Repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    // Danh sach all don hang
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
    // Ds don hang theo trang thai
    public List<Order> getOrdersByStatus(OrderStatus status) {
        return orderRepository.findByStatus(status);
    }
    
    // Thong tin don hang theo id
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
    
    // Trnang thai don hang
    public Order updateOrderStatus(Long id, OrderStatus newStatus) {
        Optional<Order> orderOpt = orderRepository.findById(id);
        if(orderOpt.isPresent()){
            Order order = orderOpt.get();
            order.setStatus(newStatus);
            return orderRepository.save(order);
        }
        return null;
    }
    
    // Hoa don
    public String generateInvoice(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Invoice -----\n");
        sb.append("Order ID: ").append(order.getId()).append("\n");
        sb.append("Customer: ").append(order.getCustomerName()).append("\n");
        sb.append("Order Date: ").append(order.getOrderDate()).append("\n");
        sb.append("Status: ").append(order.getStatus()).append("\n");
        sb.append("Tracking: ").append(order.getShippingTrackingNumber()).append("\n");
        sb.append("-------------------\n");
        return sb.toString();
    }
}
