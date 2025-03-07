package com.webshop.Demo01.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.Model.Order;
import com.webshop.Demo01.Model.OrderStatus;
import com.webshop.Demo01.Service.OrderService;

@RestController
@RequestMapping("/admin/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    // Lay ds don hang (cos the loc theo trang thai)
    //    /admin/orders?status=PROCESSING
    @GetMapping
    public List<Order> listOrders(@RequestParam(required = false) OrderStatus status) {
        if (status != null) {
            return orderService.getOrdersByStatus(status);
        } else {
            return orderService.getAllOrders();
        }
    }
    
    // Cap nhat trang thai
    //   /admin/orders/1/status?status=DELIVERED
    @PutMapping("/{orderId}/status")
    public Order updateOrderStatus(@PathVariable Long orderId, @RequestParam OrderStatus status) {
        Order updatedOrder = orderService.updateOrderStatus(orderId, status);
        if(updatedOrder == null){
            throw new RuntimeException("Order not found");
        }
        return updatedOrder;
    }
    
    // In hoa don, xuat file son hang (text)
    //    /admin/orders/1/invoice
    @GetMapping("/{orderId}/invoice")
    public String getInvoice(@PathVariable Long orderId) {
        Optional<Order> orderOpt = orderService.getOrderById(orderId);
        if(orderOpt.isPresent()){
            return orderService.generateInvoice(orderOpt.get());
        }
        throw new RuntimeException("Order not found");
    }
    
    // Van chuyen
    //    /admin/orders/1/tracking
    @GetMapping("/{orderId}/tracking")
    public String getTracking(@PathVariable Long orderId) {
        Optional<Order> orderOpt = orderService.getOrderById(orderId);
        if(orderOpt.isPresent()){
            Order order = orderOpt.get();
            return "Tracking Number: " + order.getShippingTrackingNumber();
        }
        throw new RuntimeException("Order not found");
    }
}
