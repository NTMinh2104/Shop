package com.webshop.Demo01.DTO;

public class ReportStatistics {
    private Integer totalCustomers;
    private Integer totalOrders;
    private String employeePerformance;

    public Integer getTotalCustomers() {
        return totalCustomers;
    }
    public void setTotalCustomers(Integer totalCustomers) {
        this.totalCustomers = totalCustomers;
    }
    public Integer getTotalOrders() {
        return totalOrders;
    }
    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }
    public String getEmployeePerformance() {
        return employeePerformance;
    }
    public void setEmployeePerformance(String employeePerformance) {
        this.employeePerformance = employeePerformance;
    }
}
