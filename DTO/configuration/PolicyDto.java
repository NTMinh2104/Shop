package com.webshop.Demo01.DTO.configuration;

public class PolicyDto {
    
    private Long id;
    private String type;
    private String details;

    public PolicyDto() {}


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
