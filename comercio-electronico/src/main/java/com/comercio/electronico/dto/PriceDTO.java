package com.comercio.electronico.dto;

import com.comercio.electronico.model.Brands;
import com.comercio.electronico.model.Products;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonIgnore
    private Date startDate;
    //@JsonProperty("endDate")
    private String startDateStr;
    @JsonIgnore
    private Date endDate;
    //@JsonProperty("endDate")
    private String endDateStr;
    private int priority;
    private Double price;
    private String curr;

    private ProductsDTO product;
    private BrandsDTO brand;
}
