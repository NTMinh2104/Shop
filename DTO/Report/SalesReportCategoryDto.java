package com.webshop.Demo01.DTO.Report;

public class SalesReportCategoryDto {

    private String categoryName;
    private Integer quantitySold;
    private Double totalSales;

    public SalesReportCategoryDto() {}

    public SalesReportCategoryDto(String categoryName, Integer quantitySold, Double totalSales) {
        this.categoryName = categoryName;
        this.quantitySold = quantitySold;
        this.totalSales = totalSales;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Integer getQuantitySold() {
        return quantitySold;
    }
    public void setQuantitySold(Integer quantitySold) {
        this.quantitySold = quantitySold;
    }
    public Double getTotalSales() {
        return totalSales;
    }
    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }
}
