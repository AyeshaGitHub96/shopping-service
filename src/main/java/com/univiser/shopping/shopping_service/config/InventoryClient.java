package com.univiser.shopping.shopping_service.config;

import com.univiser.shopping.shopping_service.dto.ProductDTO;
import com.univiser.shopping.shopping_service.dto.ProductListResponse;
import com.univiser.shopping.shopping_service.util.StandardResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "inventory-service", url = "${inventory.url}")
public interface InventoryClient {
    @GetMapping("/products")
    StandardResponse<List<ProductDTO>> getAllProducts();
}




