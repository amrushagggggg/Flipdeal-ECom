package com.example.flipDeal.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.flipDeal.dto.Product;
import com.example.flipDeal.utils.HttpCaller;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FlipDealClient {
    public  List<Product> fetchProductDetails() throws IOException {
        String response = HttpCaller.get("https://mock.coverself.net/rest/hiring/products", null);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response, mapper.getTypeFactory().constructCollectionType(List.class, Product.class));
    }

    public  Map<String, Object> fetchCurrencyChange() throws IOException {

        String response = HttpCaller.get("https://mock.coverself.net/rest/hiring/exchange-rates", null);
        ObjectMapper mapper = new ObjectMapper();
        return (Map<String, Object>) new ObjectMapper().readValue(response, HashMap.class).get("rates");

    }

}
