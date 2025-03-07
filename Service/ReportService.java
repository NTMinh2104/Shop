package com.webshop.Demo01.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webshop.Demo01.DTO.DailyRevenue;
import com.webshop.Demo01.DTO.MonthlyRevenue;
import com.webshop.Demo01.DTO.ReportStatistics;
import com.webshop.Demo01.DTO.SalesReportCategory;
import com.webshop.Demo01.DTO.SalesReportProduct;
import com.webshop.Demo01.DTO.YearlyRevenue;

@Service
public class ReportService {
    // Dummy data để demo

    public List<DailyRevenue> getDailyRevenue() {
        List<DailyRevenue> list = new ArrayList<>();
        list.add(new DailyRevenue("2025-03-04", 1000.0));
        list.add(new DailyRevenue("2025-03-05", 1500.0));
        return list;
    }

    public List<MonthlyRevenue> getMonthlyRevenue() {
        List<MonthlyRevenue> list = new ArrayList<>();
        list.add(new MonthlyRevenue("2025-03", 30000.0));
        list.add(new MonthlyRevenue("2025-04", 35000.0));
        return list;
    }

    public List<YearlyRevenue> getYearlyRevenue() {
        List<YearlyRevenue> list = new ArrayList<>();
        list.add(new YearlyRevenue("2024", 400000.0));
        list.add(new YearlyRevenue("2025", 450000.0));
        return list;
    }

    public List<SalesReportProduct> getSalesByProduct() {
        List<SalesReportProduct> list = new ArrayList<>();
        list.add(new SalesReportProduct("Product A", 100, 5000.0));
        list.add(new SalesReportProduct("Product B", 50, 3000.0));
        return list;
    }

    public List<SalesReportCategory> getSalesByCategory() {
        List<SalesReportCategory> list = new ArrayList<>();
        list.add(new SalesReportCategory("Category X", 150, 8000.0));
        list.add(new SalesReportCategory("Category Y", 200, 10000.0));
        return list;
    }

    public ReportStatistics getStatistics() {
        ReportStatistics stats = new ReportStatistics();
        stats.setTotalCustomers(500);
        stats.setTotalOrders(1200);
        stats.setEmployeePerformance("Average orders per employee: 50");
        return stats;
    }
}
