package com.comercio.electronico.dto;

import java.io.Serializable;

public class PromotionResponseDTO implements Serializable {
	private Integer idProduct;
	private Integer idBrand;
	private Double price;
	private String startDate;
	private String endDate;
	
	public Integer getIdProduct() {
		return idProduct;
	}
	
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	
	public Integer getIdBrand() {
		return idBrand;
	}
	
	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
