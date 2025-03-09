package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.DTO.PromotionDto;
import com.webshop.Demo01.Model.Promotion;
import com.webshop.Demo01.Repository.PromotionRepository;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Ds all chuong trinh khuyen mai
    public List<PromotionDto> getAllPromotions() {
        List<Promotion> promotions = promotionRepository.findAll();
        return promotions.stream()
                .map((Promotion promo) -> modelMapper.map(promo, PromotionDto.class))
                .collect(Collectors.toList());
    }

    // tt khuyen mai theo id
    public Optional<Promotion> getPromotionById(Long id) {
        return promotionRepository.findById(id);
    }

    // Tao moi chuong trinh khuyen mai
    public PromotionDto createPromotion(PromotionDto promotionDto) {
        Promotion promo = modelMapper.map(promotionDto, Promotion.class);
        Promotion saved = promotionRepository.save(promo);
        return modelMapper.map(saved, PromotionDto.class);
    }

    // Update khuyen mai
    public PromotionDto updatePromotion(Long id, PromotionDto updatedDto) {
        Optional<Promotion> optPromo = promotionRepository.findById(id);
        if(optPromo.isPresent()){
            Promotion promo = optPromo.get();
            promo.setCode(updatedDto.getCode());
            promo.setDescription(updatedDto.getDescription());
            promo.setUsageLimit(updatedDto.getUsageLimit());
            promo.setStartDate(updatedDto.getStartDate());
            promo.setEndDate(updatedDto.getEndDate());
            Promotion saved = promotionRepository.save(promo);
            return modelMapper.map(saved, PromotionDto.class);
        }
        return null;
    }

    // delete
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}
