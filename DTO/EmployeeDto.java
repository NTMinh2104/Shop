package com.webshop.Demo01.DTO;

public class EmployeeDto {
    
    private Long id;
    private String name;
    private String email;
    private String role; // Chuyển đổi từ enum sang chuỗi
    
    public EmployeeDto() {}

    // Getters & Setters
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
    
    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    public String getRole() { 
        return role; 
    }
    public void setRole(String role) { 
        this.role = role; 
    }
}
