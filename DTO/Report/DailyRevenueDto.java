package com.webshop.Demo01.DTO.Report;

// baos cao rieng
public class DailyRevenueDto {

    private String date;      // "2025-03-04"
    private Double revenue;

    public DailyRevenueDto() {}

    public DailyRevenueDto(String date, Double revenue) {
        this.date = date;
        this.revenue = revenue;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
}
