package com.webshop.Demo01.DTO;

import java.util.Date;

public class PromotionDto {
    private Long id;
    private String code;
    private String description;
    private Integer usageLimit;
    private Date startDate;
    private Date endDate;
    
    public PromotionDto() {}

    // Getters và Setters
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getCode() { 
        return code; 
    }
    public void setCode(String code) { 
        this.code = code; 
    }
    
    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }
    
    public Integer getUsageLimit() { 
        return usageLimit; 
    }
    public void setUsageLimit(Integer usageLimit) { 
        this.usageLimit = usageLimit;
    }
    
    public Date getStartDate() { 
        return startDate; 
    }
    public void setStartDate(Date startDate) { 
        this.startDate = startDate; 
    }
    
    public Date getEndDate() { 
        return endDate; 
    }
    public void setEndDate(Date endDate) { 
        this.endDate = endDate; 
    }
}
