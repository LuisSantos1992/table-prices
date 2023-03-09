package com.comercio.electronico.dto;

import com.comercio.electronico.model.Brands;
import com.comercio.electronico.model.Products;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PriceDTO {

    private Integer priceList;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime endDate;
    private int priority;
    private Double price;
    private String curr;

    private ProductsDTO product;
    private BrandsDTO brand;
}
