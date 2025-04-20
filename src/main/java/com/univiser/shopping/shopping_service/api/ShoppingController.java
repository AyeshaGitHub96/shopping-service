package com.univiser.shopping.shopping_service.api;

import com.univiser.shopping.shopping_service.config.InventoryClient;
import com.univiser.shopping.shopping_service.dto.ProductDTO;
import com.univiser.shopping.shopping_service.dto.ProductListResponse;
import com.univiser.shopping.shopping_service.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopping")
@RequiredArgsConstructor
public class ShoppingController {

    private final InventoryClient inventoryClient;

    @GetMapping("/products")
    public ResponseEntity<StandardResponse<List<ProductDTO>>> getProducts() {
        StandardResponse<List<ProductDTO>> response = inventoryClient.getAllProducts();

        return ResponseEntity.ok(
                new StandardResponse<>(
                        response.getStatus(),
                        response.getData(),
                        "Fetched products from inventory"
                )
        );
    }

}
