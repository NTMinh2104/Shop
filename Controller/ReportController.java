package com.webshop.Demo01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.DTO.DailyRevenue;
import com.webshop.Demo01.DTO.MonthlyRevenue;
import com.webshop.Demo01.DTO.ReportStatistics;
import com.webshop.Demo01.DTO.SalesReportCategory;
import com.webshop.Demo01.DTO.SalesReportProduct;
import com.webshop.Demo01.DTO.YearlyRevenue;
import com.webshop.Demo01.Service.ReportService;

@RestController
@RequestMapping("/admin/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    // Doanh thu theo ngay
    @GetMapping("/revenue/daily")
    public List<DailyRevenue> getDailyRevenue() {
        return reportService.getDailyRevenue();
    }

    // Doanh thu theo thang
    @GetMapping("/revenue/monthly")
    public List<MonthlyRevenue> getMonthlyRevenue() {
        return reportService.getMonthlyRevenue();
    }

    // Doanh thu theo nam
    @GetMapping("/revenue/yearly")
    public List<YearlyRevenue> getYearlyRevenue() {
        return reportService.getYearlyRevenue();
    }

    // Bao cao ban hang theo sp
    @GetMapping("/sales/product")
    public List<SalesReportProduct> getSalesByProduct() {
        return reportService.getSalesByProduct();
    }

    // Bao cao ban hang theo danh muc
    @GetMapping("/sales/category")
    public List<SalesReportCategory> getSalesByCategory() {
        return reportService.getSalesByCategory();
    }

    // Thong ke tong hop
    @GetMapping("/statistics")
    public ReportStatistics getStatistics() {
        return reportService.getStatistics();
    }
}
