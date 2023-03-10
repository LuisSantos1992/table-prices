package com.comercio.electronico.controller;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.dto.ResponseDTO;
import com.comercio.electronico.serviceimpl.PricesServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/promotion")
public class ConsultaPriceController {

    private static  final Logger logger =  LoggerFactory.getLogger(ConsultaPriceController.class);
    @Autowired
    PricesServiceImpl priceServiceImpl;

    @GetMapping(value = "/getAllPrices", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getAllPrices() {
        List<PriceDTO> prices = priceServiceImpl.getAllPrices();
        return prices;
    }

    @GetMapping(value = "/getPromotionNow", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getPromotionNow(@RequestParam("applicationDate") String applicationDate,
                                           @RequestParam("productId") String productId,
                                           @RequestParam("brandId") String brandId) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startdate = formatter.parse(applicationDate);
        logger.info("applicationDate: "+applicationDate);
        logger.info("productId: "+productId);
        logger.info("brandId: "+brandId);
        Integer brand = Integer.parseInt(brandId);
        Integer product = Integer.parseInt(productId);
        List<PriceDTO> prices = priceServiceImpl.findPricesPromotion(brand,product,startdate,startdate);

        return prices;
    }


    @GetMapping(value = "/getAllPricesTest", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getAllPricesTest() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Integer brand = Integer.parseInt("1");
        Integer product = Integer.parseInt("1");
        Date startdate = formatter.parse("2020-06-14 00:00:00");
        Date endDate = formatter.parse("2020-06-14 18:30:00");
        List<PriceDTO> prices = priceServiceImpl.findPricesPromotion(brand,product,startdate,endDate);

        return prices;
    }

    @GetMapping(value = "/getPricesById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Object> getAllPrices(@PathVariable Integer id) {
        Optional<PriceDTO> prices;
        ResponseDTO response = null;
        Object respuesta;
        try {
            prices = priceServiceImpl.findById(id);
            respuesta = prices;
        } catch (Exception e) {
            response = new ResponseDTO();
            response.setCode("ERROR:API");
            response.setMensaje(e.getMessage());
            respuesta = response;
            e.printStackTrace();
        }

        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}
