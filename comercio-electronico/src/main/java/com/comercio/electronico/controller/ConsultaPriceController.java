package com.comercio.electronico.controller;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.serviceimpl.PricesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.comercio.electronico.dto.PromotionDTO;
import com.comercio.electronico.dto.PromotionResponseDTO;

import java.util.List;

@RestController
@RequestMapping("api/promotion")
public class ConsultaPriceController {

    @Autowired
    PricesServiceImpl priceServiceImpl;

    @GetMapping(value="/getAllPrices", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getAllPrices() {
        List<PriceDTO> prices = priceServiceImpl.getAllPrices();
        return prices;
    }
    
    @PostMapping(value="/getPromotion", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private PromotionResponseDTO responsePromotion(@RequestBody PromotionDTO promotion) {
    	PromotionResponseDTO promotionObj = new PromotionResponseDTO();
    	return promotionObj;
	}
}
