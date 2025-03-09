package com.webshop.Demo01.DTO.configuration;

public class UIConfigurationDto {
    
    private Long id;
    private String bannerUrl;
    private String logoUrl;
    private String primaryColor;
    private String secondaryColor;

    public UIConfigurationDto() {}


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
