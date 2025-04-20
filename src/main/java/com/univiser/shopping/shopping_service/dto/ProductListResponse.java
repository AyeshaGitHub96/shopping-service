package com.univiser.shopping.shopping_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductListResponse {
    private int status;
    private List<ProductDTO> data;
    private String message;
}


