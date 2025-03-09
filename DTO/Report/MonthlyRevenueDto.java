package com.webshop.Demo01.DTO.Report;

public class MonthlyRevenueDto {

    private String month;     // "2025-03"
    private Double revenue;

    public MonthlyRevenueDto() {}

    public MonthlyRevenueDto(String month, Double revenue) {
        this.month = month;
        this.revenue = revenue;
    }

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
}
