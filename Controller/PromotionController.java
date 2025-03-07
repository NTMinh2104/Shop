package com.webshop.Demo01.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Demo01.Model.Promotion;
import com.webshop.Demo01.Service.PromotionService;

@RestController
@RequestMapping("/admin/promotions")
public class PromotionController {
    @Autowired
    private PromotionService promotionService;

    // Danh sach tat ca cac khuyen mai
    @GetMapping
    public List<Promotion> listPromotions() {
        return promotionService.getAllPromotions();
    }

    // Khuyen mai theo id sp
    @GetMapping("/{id}")
    public Optional<Promotion> getPromotion(@PathVariable Long id) {
        return promotionService.getPromotionById(id);
    }

    // Tao moi khuyen mai (+ ma giam gia)
    @PostMapping
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return promotionService.createPromotion(promotion);
    }

    // Cap nhat thong tin khuyen mai
    @PutMapping("/{id}")
    public Promotion updatePromotion(@PathVariable Long id, @RequestBody Promotion promotion) {
        Promotion updated = promotionService.updatePromotion(id, promotion);
        if(updated == null) {
            throw new RuntimeException("Promotion not found");
        }
        return updated;
    }

    // Xoa khuyen mai
    @DeleteMapping("/{id}")
    public void deletePromotion(@PathVariable Long id) {
        promotionService.deletePromotion(id);
    }
}
