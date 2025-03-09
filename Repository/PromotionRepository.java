package com.webshop.Demo01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webshop.Demo01.Model.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, Long>{
    Promotion findByCode(String code);
}
