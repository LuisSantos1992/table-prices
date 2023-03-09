package com.comercio.electronico.controller;

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

@RestController
@RequestMapping("api/promotion")
public class ConsultaPriceController {

    @GetMapping(value="/getPrice", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private String getPrice() {
        return "Version 1.0";
    }
    
    @PostMapping(value="/getPromotion", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private PromotionResponseDTO responsePromotion(@RequestBody PromotionDTO promotion) {
    	PromotionResponseDTO promotionObj = new PromotionResponseDTO();
    	return promotionObj;
	}
}
