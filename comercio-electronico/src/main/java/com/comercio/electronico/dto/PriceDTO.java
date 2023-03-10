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
    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "es-SV",timezone = "America/EL_Salvador")
    private Date endDate;
    private int priority;
    private Double price;
    private String curr;

    private ProductsDTO product;
    private BrandsDTO brand;
}
