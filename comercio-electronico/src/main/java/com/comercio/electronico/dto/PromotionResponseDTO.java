package com.comercio.electronico.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromotionResponseDTO implements Serializable {
	private Integer productId;
	private Integer brandId;
	private Double price;
	private String startDate;
	private String endDate;
	
}
