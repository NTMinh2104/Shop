package com.webshop.Demo01.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipping_methods")
public class ShippingMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private String description;
    
    private Double fee; // Phi van chuyen

    public ShippingMethod() {}

    public ShippingMethod(String name, String description, Double fee) {
        this.name = name;
        this.description = description;
        this.fee = fee;
    }

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }
    
    public Double getFee() { 
        return fee; 
    }
    public void setFee(Double fee) { 
        this.fee = fee; 
    }
}
