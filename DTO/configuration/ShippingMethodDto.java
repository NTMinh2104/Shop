package com.webshop.Demo01.DTO.configuration;

public class ShippingMethodDto {
    
    private Long id;
    private String name;
    private String description;
    private Double fee;

    public ShippingMethodDto() {}


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
