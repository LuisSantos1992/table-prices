package com.comercio.electronico.service;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.model.Prices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface PricesService {

    List<PriceDTO> getAllPrices();
    Optional<PriceDTO> findById(Integer id);
    PriceDTO save(PriceDTO prices);
    PriceDTO Update(PriceDTO prices);
    void delete(Long id);
}
