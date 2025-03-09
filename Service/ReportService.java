package com.webshop.Demo01.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webshop.Demo01.DTO.Report.DailyRevenueDto;
import com.webshop.Demo01.DTO.Report.MonthlyRevenueDto;
import com.webshop.Demo01.DTO.Report.ReportStatisticsDto;
import com.webshop.Demo01.DTO.Report.SalesReportCategoryDto;
import com.webshop.Demo01.DTO.Report.SalesReportProductDto;
import com.webshop.Demo01.DTO.Report.YearlyRevenueDto;

@Service
public class ReportService {
    // Du lieu fake

    // doanh thu theo ngay
    public List<DailyRevenueDto> getDailyRevenue() {
        List<DailyRevenueDto> daily = new ArrayList<>();
        daily.add(new DailyRevenueDto("2025-03-04", 1000.0));
        daily.add(new DailyRevenueDto("2025-03-05", 1500.0));
        return daily;
    }

    // doanh thu thang
    public List<MonthlyRevenueDto> getMonthlyRevenue() {
        List<MonthlyRevenueDto> monthly = new ArrayList<>();
        monthly.add(new MonthlyRevenueDto("2025-03", 30000.0));
        monthly.add(new MonthlyRevenueDto("2025-04", 35000.0));
        return monthly;
    }

    // daonh thu nam
    public List<YearlyRevenueDto> getYearlyRevenue() {
        List<YearlyRevenueDto> yearly = new ArrayList<>();
        yearly.add(new YearlyRevenueDto("2024", 400000.0));
        yearly.add(new YearlyRevenueDto("2025", 450000.0));
        return yearly;
    }

    // Bao cao ban hang theo spham
    public List<SalesReportProductDto> getSalesByProduct() {
        List<SalesReportProductDto> products = new ArrayList<>();
        products.add(new SalesReportProductDto("Product A", 100, 5000.0));
        products.add(new SalesReportProductDto("Product B", 50, 3000.0));
        return products;
    }

    // theo danh muc
    public List<SalesReportCategoryDto> getSalesByCategory() {
        List<SalesReportCategoryDto> categories = new ArrayList<>();
        categories.add(new SalesReportCategoryDto("Category X", 150, 8000.0));
        categories.add(new SalesReportCategoryDto("Category Y", 200, 10000.0));
        return categories;
    }

    // thong ke khach hang, don hang, hieu suat
    public ReportStatisticsDto getStatistics() {
        return new ReportStatisticsDto(500, 1200, "Average orders per employee: 50");
    }
}
