package com.comercio.electronico.controller;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.serviceimpl.PricesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value="/getPricesById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private  ResponseEntity<Object> getAllPrices(@PathVariable Integer id) {
        Optional<PriceDTO> prices = priceServiceImpl.findById(id);
        return new ResponseEntity<>(prices,HttpStatus.OK);
    }

}
