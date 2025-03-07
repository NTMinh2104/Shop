package com.webshop.Demo01.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.Demo01.Model.Promotion;
import com.webshop.Demo01.Repository.PromotionRepository;

@Service
public class PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;

    // Ds all chuong trinh khuyen mai
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    // tt khuyen mai theo id
    public Optional<Promotion> getPromotionById(Long id) {
        return promotionRepository.findById(id);
    }

    // Tao moi chuong trinh khuyen mai
    public Promotion createPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    // Update khuyen mai
    public Promotion updatePromotion(Long id, Promotion updatedPromotion) {
        return promotionRepository.findById(id).map(promotion -> {
            promotion.setCode(updatedPromotion.getCode());
            promotion.setDescription(updatedPromotion.getDescription());
            promotion.setUsageLimit(updatedPromotion.getUsageLimit());
            promotion.setStartDate(updatedPromotion.getStartDate());
            promotion.setEndDate(updatedPromotion.getEndDate());
            return promotionRepository.save(promotion);
        }).orElse(null);
    }

    // delete
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}
