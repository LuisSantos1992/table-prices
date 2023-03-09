package com.comercio.electronico.dto;

import com.comercio.electronico.model.Brands;
import com.comercio.electronico.model.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PriceDTO {

    private Long priceList;
    private String name;
    private Date startDate;
    private Date endDate;
    private int priority;
    private Double price;
    private String curr;

    private ProductsDTO product;
    private BrandsDTO brand;
}
