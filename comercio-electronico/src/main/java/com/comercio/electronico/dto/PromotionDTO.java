package com.comercio.electronico.dto;

import java.io.Serializable;

public class PromotionDTO implements Serializable {
	private String aplicationDate;
	private String identifyProduct;
	private String identifyBrand;
	
	public String getAplicationDate() {
		return aplicationDate;
	}
	
	public void setAplicationDate(String aplicationDate) {
		this.aplicationDate = aplicationDate;
	}
	
	public String getIdentifyProduct() {
		return identifyProduct;
	}
	
	public void setIdentifyProduct(String identifyProduct) {
		this.identifyProduct = identifyProduct;
	}
	
	public String getIdentifyBrand() {
		return identifyBrand;
	}
	
	public void setIdentifyBrand(String identifyBrand) {
		this.identifyBrand = identifyBrand;
	}
}
