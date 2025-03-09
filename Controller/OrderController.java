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

import com.webshop.Demo01.DTO.OrderDto;
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
    public List<OrderDto> listOrders(@RequestParam(required = false) OrderStatus status) {
        return orderService.getAllOrders(Optional.ofNullable(status));
    }
    
    // Cap nhat trang thai
    //   /admin/orders/1/status?status=DELIVERED
    @PutMapping("/{id}/status")
    public Order updateOrderStatus(@PathVariable Long id, @RequestParam OrderStatus status) {
        Order updatedOrder = orderService.updateOrderStatus(id, status);
        if(updatedOrder == null) {
            throw new RuntimeException("Order not found");
        }
        return updatedOrder;
    }
    
    // In hoa don, xuat file don hang (text)
    //    /admin/orders/1/invoice
    @GetMapping("/{id}/invoice")
    public String getInvoice(@PathVariable Long id) {
        Optional<Order> orderOpt = orderService.getOrderById(id);
        if(orderOpt.isPresent()){
            return orderService.generateInvoice(orderOpt.get());
        }
        throw new RuntimeException("Order not found");
    }
    
    // Van chuyen
    //    /admin/orders/1/tracking
    @GetMapping("/{id}/tracking")
    public String getTracking(@PathVariable Long id) {
        return orderService.getTrackingInfo(id);
    }
}
