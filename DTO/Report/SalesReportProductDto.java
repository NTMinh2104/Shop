package com.webshop.Demo01.DTO.Report;

public class SalesReportProductDto {

    private String productName;
    private Integer quantitySold;
    private Double totalSales;

    public SalesReportProductDto() {}

    public SalesReportProductDto(String productName, Integer quantitySold, Double totalSales) {
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.totalSales = totalSales;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
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
