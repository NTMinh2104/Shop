package com.webshop.Demo01.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "policies")
public class Policy {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Chinh sach bao hanh
    @Column(nullable = false)
    private String type;
    
    @Column(length = 1000)
    private String details;

    public Policy() {}

    public Policy(String type, String details) {
        this.type = type;
        this.details = details;
    }


    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getType() { 
        return type; 
    }
    public void setType(String type) { 
        this.type = type; 
    }
    
    public String getDetails() { 
        return details; 
    }
    public void setDetails(String details) { 
        this.details = details; 
    }
}
