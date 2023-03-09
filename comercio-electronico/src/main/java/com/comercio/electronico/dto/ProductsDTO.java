package com.comercio.electronico.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductsDTO {
    private Long id;
    private Long productId;
    private String name;
}
