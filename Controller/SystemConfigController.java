package com.webshop.Demo01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.DTO.configuration.PaymentMethodDto;
import com.webshop.Demo01.DTO.configuration.PolicyDto;
import com.webshop.Demo01.DTO.configuration.ShippingMethodDto;
import com.webshop.Demo01.DTO.configuration.UIConfigurationDto;
import com.webshop.Demo01.Service.SystemConfigService;

@RestController
@RequestMapping("/admin/config")
public class SystemConfigController {
    
    @Autowired
    private SystemConfigService systemConfigService;
    

    @GetMapping("/shipping")
    public List<ShippingMethodDto> getAllShippingMethods() {
        return systemConfigService.getAllShippingMethods();
    }

    @PostMapping("/shipping")
    public ShippingMethodDto createShippingMethod(@RequestBody ShippingMethodDto dto) {
        return systemConfigService.createShippingMethod(dto);
    }

    @PutMapping("/shipping/{id}")
    public ShippingMethodDto updateShippingMethod(@PathVariable Long id, @RequestBody ShippingMethodDto dto) {
        ShippingMethodDto updated = systemConfigService.updateShippingMethod(id, dto);
        if(updated == null){
            throw new RuntimeException("Shipping method not found");
        }
        return updated;
    }

    @DeleteMapping("/shipping/{id}")
    public void deleteShippingMethod(@PathVariable Long id) {
        systemConfigService.deleteShippingMethod(id);
    }
    

    @GetMapping("/payment")
    public List<PaymentMethodDto> getAllPaymentMethods() {
        return systemConfigService.getAllPaymentMethods();
    }

    @PostMapping("/payment")
    public PaymentMethodDto createPaymentMethod(@RequestBody PaymentMethodDto dto) {
        return systemConfigService.createPaymentMethod(dto);
    }

    @PutMapping("/payment/{id}")
    public PaymentMethodDto updatePaymentMethod(@PathVariable Long id, @RequestBody PaymentMethodDto dto) {
        PaymentMethodDto updated = systemConfigService.updatePaymentMethod(id, dto);
        if(updated == null){
            throw new RuntimeException("Payment method not found");
        }
        return updated;
    }

    @DeleteMapping("/payment/{id}")
    public void deletePaymentMethod(@PathVariable Long id) {
        systemConfigService.deletePaymentMethod(id);
    }
    

    @GetMapping("/policies")
    public List<PolicyDto> getAllPolicies() {
        return systemConfigService.getAllPolicies();
    }

    @PostMapping("/policies")
    public PolicyDto createPolicy(@RequestBody PolicyDto dto) {
        return systemConfigService.createPolicy(dto);
    }

    @PutMapping("/policies/{id}")
    public PolicyDto updatePolicy(@PathVariable Long id, @RequestBody PolicyDto dto) {
        PolicyDto updated = systemConfigService.updatePolicy(id, dto);
        if(updated == null){
            throw new RuntimeException("Policy not found");
        }
        return updated;
    }

    @DeleteMapping("/policies/{id}")
    public void deletePolicy(@PathVariable Long id) {
        systemConfigService.deletePolicy(id);
    }
    

    @GetMapping("/ui")
    public List<UIConfigurationDto> getAllUIConfigurations() {
        return systemConfigService.getAllUIConfigurations();
    }

    @PostMapping("/ui")
    public UIConfigurationDto createUIConfiguration(@RequestBody UIConfigurationDto dto) {
        return systemConfigService.createUIConfiguration(dto);
    }

    @PutMapping("/ui/{id}")
    public UIConfigurationDto updateUIConfiguration(@PathVariable Long id, @RequestBody UIConfigurationDto dto) {
        UIConfigurationDto updated = systemConfigService.updateUIConfiguration(id, dto);
        if(updated == null){
            throw new RuntimeException("UI configuration not found");
        }
        return updated;
    }
    
    @DeleteMapping("/ui/{id}")
    public void deleteUIConfiguration(@PathVariable Long id) {
        systemConfigService.deleteUIConfiguration(id);
    }
}
