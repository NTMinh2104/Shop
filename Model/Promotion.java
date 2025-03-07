package com.webshop.Demo01.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ma giam gia (lock)
    @Column(unique = true, nullable = false)
    private String code;

    // Mo ta chuong trinh khuyen mai
    private String description;

    // San pham gioi han (so lan su dung toi da)
    private Integer usageLimit;

    // Thoi gian ap dung sale
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    // Ket thuc sale
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    public Promotion() {}

    public Promotion(String code, String description, Integer usageLimit, Date startDate, Date endDate) {
        this.code = code;
        this.description = description;
        this.usageLimit = usageLimit;
        this.startDate = startDate;
        this.endDate = endDate;
    }



    public Long getId() {
        return id;
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
