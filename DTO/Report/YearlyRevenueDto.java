package com.webshop.Demo01.DTO.Report;

public class YearlyRevenueDto {

    private String year;      // "2025"
    private Double revenue;

    public YearlyRevenueDto() {}

    public YearlyRevenueDto(String year, Double revenue) {
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
