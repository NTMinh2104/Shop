package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.DTO.configuration.PaymentMethodDto;
import com.webshop.Demo01.DTO.configuration.PolicyDto;
import com.webshop.Demo01.DTO.configuration.ShippingMethodDto;
import com.webshop.Demo01.DTO.configuration.UIConfigurationDto;
import com.webshop.Demo01.Model.PaymentMethod;
import com.webshop.Demo01.Model.Policy;
import com.webshop.Demo01.Model.ShippingMethod;
import com.webshop.Demo01.Model.UIConfiguration;
import com.webshop.Demo01.Repository.PaymentMethodRepository;
import com.webshop.Demo01.Repository.PolicyRepository;
import com.webshop.Demo01.Repository.ShippingMethodRepository;
import com.webshop.Demo01.Repository.UIConfigurationRepository;

@Service
public class SystemConfigService {
    
    @Autowired
    private ShippingMethodRepository shippingMethodRepository;
    
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
    
    @Autowired
    private PolicyRepository policyRepository;
    
    @Autowired
    private UIConfigurationRepository uiConfigurationRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    
    // Shipping Methods
    public List<ShippingMethodDto> getAllShippingMethods() {
        return shippingMethodRepository.findAll()
                .stream()
                .map(sm -> modelMapper.map(sm, ShippingMethodDto.class))
                .collect(Collectors.toList());
    }
    public ShippingMethodDto createShippingMethod(ShippingMethodDto dto) {
        ShippingMethod sm = modelMapper.map(dto, ShippingMethod.class);
        ShippingMethod saved = shippingMethodRepository.save(sm);
        return modelMapper.map(saved, ShippingMethodDto.class);
    }
    public ShippingMethodDto updateShippingMethod(Long id, ShippingMethodDto dto) {
        Optional<ShippingMethod> opt = shippingMethodRepository.findById(id);
        if(opt.isPresent()){
            ShippingMethod sm = opt.get();
            sm.setName(dto.getName());
            sm.setDescription(dto.getDescription());
            sm.setFee(dto.getFee());
            ShippingMethod saved = shippingMethodRepository.save(sm);
            return modelMapper.map(saved, ShippingMethodDto.class);
        }
        return null;
    }
    public void deleteShippingMethod(Long id) {
        shippingMethodRepository.deleteById(id);
    }
    
    // Payment Methods
    public List<PaymentMethodDto> getAllPaymentMethods() {
        return paymentMethodRepository.findAll()
                .stream()
                .map(pm -> modelMapper.map(pm, PaymentMethodDto.class))
                .collect(Collectors.toList());
    }
    public PaymentMethodDto createPaymentMethod(PaymentMethodDto dto) {
        PaymentMethod pm = modelMapper.map(dto, PaymentMethod.class);
        PaymentMethod saved = paymentMethodRepository.save(pm);
        return modelMapper.map(saved, PaymentMethodDto.class);
    }
    public PaymentMethodDto updatePaymentMethod(Long id, PaymentMethodDto dto) {
        Optional<PaymentMethod> opt = paymentMethodRepository.findById(id);
        if(opt.isPresent()){
            PaymentMethod pm = opt.get();
            pm.setName(dto.getName());
            pm.setDescription(dto.getDescription());
            PaymentMethod saved = paymentMethodRepository.save(pm);
            return modelMapper.map(saved, PaymentMethodDto.class);
        }
        return null;
    }
    public void deletePaymentMethod(Long id) {
        paymentMethodRepository.deleteById(id);
    }
    
    // Policies
    public List<PolicyDto> getAllPolicies() {
        return policyRepository.findAll()
                .stream()
                .map(policy -> modelMapper.map(policy, PolicyDto.class))
                .collect(Collectors.toList());
    }
    public PolicyDto createPolicy(PolicyDto dto) {
        Policy policy = modelMapper.map(dto, Policy.class);
        Policy saved = policyRepository.save(policy);
        return modelMapper.map(saved, PolicyDto.class);
    }
    public PolicyDto updatePolicy(Long id, PolicyDto dto) {
        Optional<Policy> opt = policyRepository.findById(id);
        if(opt.isPresent()){
            Policy policy = opt.get();
            policy.setType(dto.getType());
            policy.setDetails(dto.getDetails());
            Policy saved = policyRepository.save(policy);
            return modelMapper.map(saved, PolicyDto.class);
        }
        return null;
    }
    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
    
    // UI Configuration
    public List<UIConfigurationDto> getAllUIConfigurations() {
        return uiConfigurationRepository.findAll()
                .stream()
                .map(ui -> modelMapper.map(ui, UIConfigurationDto.class))
                .collect(Collectors.toList());
    }
    public UIConfigurationDto createUIConfiguration(UIConfigurationDto dto) {
        UIConfiguration ui = modelMapper.map(dto, UIConfiguration.class);
        UIConfiguration saved = uiConfigurationRepository.save(ui);
        return modelMapper.map(saved, UIConfigurationDto.class);
    }
    public UIConfigurationDto updateUIConfiguration(Long id, UIConfigurationDto dto) {
        Optional<UIConfiguration> opt = uiConfigurationRepository.findById(id);
        if(opt.isPresent()){
            UIConfiguration ui = opt.get();
            ui.setBannerUrl(dto.getBannerUrl());
            ui.setLogoUrl(dto.getLogoUrl());
            ui.setPrimaryColor(dto.getPrimaryColor());
            ui.setSecondaryColor(dto.getSecondaryColor());
            UIConfiguration saved = uiConfigurationRepository.save(ui);
            return modelMapper.map(saved, UIConfigurationDto.class);
        }
        return null;
    }
    public void deleteUIConfiguration(Long id) {
        uiConfigurationRepository.deleteById(id);
    }
}
