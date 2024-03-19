package com.example.flipDeal.Service.StrategyInterface;

import com.example.flipDeal.dto.Discount;
import com.example.flipDeal.dto.Product;

public interface PromotionStrategy {
    public Discount calculateDiscount(Product product);

}
