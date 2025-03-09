package com.webshop.Demo01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.DTO.Report.DailyRevenueDto;
import com.webshop.Demo01.DTO.Report.MonthlyRevenueDto;
import com.webshop.Demo01.DTO.Report.ReportStatisticsDto;
import com.webshop.Demo01.DTO.Report.SalesReportCategoryDto;
import com.webshop.Demo01.DTO.Report.SalesReportProductDto;
import com.webshop.Demo01.DTO.Report.YearlyRevenueDto;
import com.webshop.Demo01.Service.ReportService;

@RestController
@RequestMapping("/admin/reports")
public class ReportController {
    
    @Autowired
    private ReportService reportService;

    // Doanh thu theo ngay
    @GetMapping("/revenue/daily")
    public List<DailyRevenueDto> getDailyRevenue() {
        return reportService.getDailyRevenue();
    }

    // Doanh thu theo thang
    @GetMapping("/revenue/monthly")
    public List<MonthlyRevenueDto> getMonthlyRevenue() {
        return reportService.getMonthlyRevenue();
    }

    // Doanh thu theo nam
    @GetMapping("/revenue/yearly")
    public List<YearlyRevenueDto> getYearlyRevenue() {
        return reportService.getYearlyRevenue();
    }

    // Bao cao ban hang theo sp
    @GetMapping("/sales/product")
    public List<SalesReportProductDto> getSalesByProduct() {
        return reportService.getSalesByProduct();
    }

    // Bao cao ban hang theo danh muc
    @GetMapping("/sales/category")
    public List<SalesReportCategoryDto> getSalesByCategory() {
        return reportService.getSalesByCategory();
    }

    // Thong ke tong hop
    @GetMapping("/statistics")
    public ReportStatisticsDto getStatistics() {
        return reportService.getStatistics();
    }
}
