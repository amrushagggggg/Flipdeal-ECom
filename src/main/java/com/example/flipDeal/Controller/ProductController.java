package com.example.flipDeal.Controller;


import com.example.flipDeal.Service.ProductService;
import com.example.flipDeal.dto.Discount;
import com.example.flipDeal.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;



@RestController
@RequestMapping("/Api/v1/Product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/discount")
    public List<Product> applyPromotion() throws IOException {
        return  productService.applyPromotion("PROMOTIONSETB");
    }


}
