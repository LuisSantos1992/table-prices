package com.comercio.electronico.controller;

import com.comercio.electronico.dto.BrandsDTO;
import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.dto.ResponseDTO;
import com.comercio.electronico.serviceimpl.BrandsServiceImpl;
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
public class BrandController {

    @Autowired
    BrandsServiceImpl brandsServiceImpl;

    @GetMapping(value = "/getAllBrans", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<BrandsDTO> getAllPrices() {
        List<BrandsDTO> prices = brandsServiceImpl.getAllBrands();
        return prices;
    }


}
