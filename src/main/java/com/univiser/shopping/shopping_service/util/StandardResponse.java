package com.univiser.shopping.shopping_service.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandardResponse<T> {
    private int status;
    private T data;
    private String message;
}
