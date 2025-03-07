package com.webshop.Demo01.DTO;

public class YearlyRevenue {
    private String year;
    private Double revenue;

    public YearlyRevenue(String year, Double revenue) {
        this.year = year;
        this.revenue = revenue;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
}
