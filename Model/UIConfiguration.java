package com.webshop.Demo01.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ui_configurations")
public class UIConfiguration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String bannerUrl;
    private String logoUrl;
    private String primaryColor;
    private String secondaryColor;

    public UIConfiguration() {}

    public UIConfiguration(String bannerUrl, String logoUrl, String primaryColor, String secondaryColor) {
        this.bannerUrl = bannerUrl;
        this.logoUrl = logoUrl;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }


    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getBannerUrl() { 
        return bannerUrl; 
    }
    public void setBannerUrl(String bannerUrl) { 
        this.bannerUrl = bannerUrl; 
    }
    
    public String getLogoUrl() { 
        return logoUrl; 
    }
    public void setLogoUrl(String logoUrl) { 
        this.logoUrl = logoUrl; 
    }
    
    public String getPrimaryColor() { 
        return primaryColor; 
    }
    public void setPrimaryColor(String primaryColor) { 
        this.primaryColor = primaryColor; 
    }
    
    public String getSecondaryColor() { 
        return secondaryColor; 
    }
    public void setSecondaryColor(String secondaryColor) { 
        this.secondaryColor = secondaryColor; 
    }
}
