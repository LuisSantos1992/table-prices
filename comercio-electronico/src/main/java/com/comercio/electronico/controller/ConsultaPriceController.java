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
import java.util.ArrayList;
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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<PriceDTO> prices = priceServiceImpl.getAllPrices();
        for(PriceDTO p : prices){
            p.setStartDateStr(formatter.format(p.getStartDate()));
            p.setEndDateStr(formatter.format(p.getEndDate()));
        }
        return prices;
    }

    @GetMapping(value = "/getPromotionNow", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getPromotionNow(@RequestParam("applicationDate") String applicationDate,
                                           @RequestParam("productId") String productId,
                                           @RequestParam("brandId") String brandId) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startdate = formatter.parse(applicationDate);
        logger.info("applicationDate: "+applicationDate);
        logger.info("productId: "+productId);
        logger.info("brandId: "+brandId);

        //Retornar la lista nueva con la prioridad
        List<PriceDTO> pricesMostrar = new ArrayList<>();
        try{
            Integer brand = Integer.parseInt(brandId);
            Integer product = Integer.parseInt(productId);
            List<PriceDTO> prices = priceServiceImpl.findPricesPromotion(brand,product,startdate,startdate);
            /*for(PriceDTO p : prices){
                p.setStartDateStr(formatter.format(p.getStartDate()));
                p.setEndDateStr(formatter.format(p.getEndDate()));
            }*/

            logger.info("list old: "+ prices.toString());
            for (PriceDTO m : prices){
                m.setStartDateStr(formatter.format(m.getStartDate()));
                m.setEndDateStr(formatter.format(m.getEndDate()));
                if(m.getPriority() == 1){
                    pricesMostrar.add(m);
                }

            }
            logger.info("list New: "+pricesMostrar.toString());

        }catch(Exception e){
            logger.info("Error de Proceso: "+e);
        }

        return pricesMostrar;
        //return prices;
    }


    @GetMapping(value = "/getAllPricesTest", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    private List<PriceDTO> getAllPricesTest() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Integer brand = Integer.parseInt("1");
        Integer product = Integer.parseInt("1");
        Date startdate = formatter.parse("2020-06-14 15:00:00");
        Date endDate = formatter.parse("2020-06-14 18:30:00");
        List<PriceDTO> prices = priceServiceImpl.findPricesPromotion(brand,product,startdate,startdate);
        for(PriceDTO p : prices){
            p.setStartDateStr(formatter.format(p.getStartDate()));
            p.setEndDateStr(formatter.format(p.getEndDate()));
        }

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
