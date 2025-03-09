package com.webshop.Demo01.DTO;

import java.util.Date;

public class OrderDto {
    
    private Long id;
    private String customerName;
    private String status;      // Dạng String để dễ hiển thị (đã chuyển đổi từ enum)
    private String shippingTrackingNumber;
    private Date orderDate;

    public OrderDto() {
        
    }


    public Long getId() { return id; }
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getCustomerName() { 
        return customerName; 
    }
    public void setCustomerName(String customerName) { 
        this.customerName = customerName; 
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { 
        this.status = status;
    }

    public String getShippingTrackingNumber() { 
        return shippingTrackingNumber; 
    }
    public void setShippingTrackingNumber(String shippingTrackingNumber) { 
        this.shippingTrackingNumber = shippingTrackingNumber; 
    }

    public Date getOrderDate() { 
        return orderDate; 
    }
    public void setOrderDate(Date orderDate) { 
        this.orderDate = orderDate; 
    }
}
