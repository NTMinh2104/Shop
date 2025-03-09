package com.webshop.Demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
}


// @SpringBootApplication
// public class ShopApplication implements CommandLineRunner {

// 	@Autowired
//     private OrderService orderService;

//     @Autowired
//     private EmployeeService employeeService;

//     @Autowired
//     private PromotionService promotionService;

//     @Autowired
//     private ReportService reportService;

//     public static void main(String[] args) {
//         SpringApplication app = new SpringApplication(ShopApplication.class);
//         //off tomcat
//         app.setWebApplicationType(WebApplicationType.NONE);
//         app.run(args);
//     }

//     @Override
//     public void run(String... args) throws Exception {
        
//         Order order = orderService.getOrderById(1L).orElse(null);
//         if (order != null) {

//             System.out.println(orderService.generateInvoice(order));
//         } else {
//             System.out.println("Khong tim thay don hang co id 1");
//         }



//         System.out.println("");
//         System.out.println("Danh sach nhan vien:");
//         for (Employee emp : employeeService.getAllEmployees()) {
//             System.out.println("ID: " + emp.getId() + " - Name: " + emp.getName() + " - Email: " + emp.getEmail() + " - Role: " + emp.getRole());
//             System.out.println();
//         }






        
//         // Lay ds khuyen mai co san trong csdl
//         List<Promotion> promotions = promotionService.getAllPromotions();
//         if (promotions.isEmpty()) {

            
//             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//             Date startDate = sdf.parse("2025-03-04 00:00:00");
//             Date endDate = sdf.parse("2025-03-10 23:59:59");
//             Promotion samplePromotion = new Promotion("SAVE20", "Giam gia 20% cho don hang dau tien", 100, startDate, endDate);
//             promotionService.createPromotion(samplePromotion);
//             System.out.println("Da tao khuyen mai mau.");
//         }

//         // 
//         System.out.println("Danh sach khuyen mai:");
//         for (Promotion promo : promotionService.getAllPromotions()) {
//             System.out.println("ID: " + promo.getId());
//             System.out.println("Code: " + promo.getCode());
//             System.out.println("Description: " + promo.getDescription());
//             System.out.println("Usage Limit: " + promo.getUsageLimit());
//             System.out.println("Start Date: " + promo.getStartDate());
//             System.out.println("End Date: " + promo.getEndDate());
//             System.out.println("--------------------------------");
//         }







//         System.out.println("----- Doanh thu theo ngay -----");
//         List<DailyRevenue> daily = reportService.getDailyRevenue();
//         daily.forEach(d -> System.out.println("Date: " + d.getDate() + ", Revenue: " + d.getRevenue()));

//         System.out.println("\n----- Doanh thu theo thang -----");
//         List<MonthlyRevenue> monthly = reportService.getMonthlyRevenue();
//         monthly.forEach(m -> System.out.println("Month: " + m.getMonth() + ", Revenue: " + m.getRevenue()));

//         System.out.println("\n----- Doanh thu theo nam -----");
//         List<YearlyRevenue> yearly = reportService.getYearlyRevenue();
//         yearly.forEach(y -> System.out.println("Year: " + y.getYear() + ", Revenue: " + y.getRevenue()));

//         System.out.println("\n----- Bao cao ban hang theo san pham -----");
//         List<SalesReportProduct> productSales = reportService.getSalesByProduct();
//         productSales.forEach(p -> System.out.println("Product: " + p.getProductName() 
//             + ", Quantity: " + p.getQuantitySold() + ", Total Sales: " + p.getTotalSales()));

//         System.out.println("\n----- Bao cao ban hang theo danh muc -----");
//         List<SalesReportCategory> categorySales = reportService.getSalesByCategory();
//         categorySales.forEach(c -> System.out.println("Category: " + c.getCategoryName() 
//             + ", Quantity: " + c.getQuantitySold() + ", Total Sales: " + c.getTotalSales()));

//         System.out.println("\n----- Thong ke tong hop -----");
//         ReportStatistics stats = reportService.getStatistics();
//         System.out.println("Total Customers: " + stats.getTotalCustomers());
//         System.out.println("Total Orders: " + stats.getTotalOrders());
//         System.out.println("Employee Performance: " + stats.getEmployeePerformance());
//     }
// }
