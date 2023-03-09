package com.comercio.electronico.service;

import com.comercio.electronico.dto.BrandsDTO;
import com.comercio.electronico.dto.PriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BrandsService {

    List<BrandsDTO> getAllBrands();
    Optional<BrandsDTO> findById(Integer id);
    BrandsDTO save(BrandsDTO prices);
    BrandsDTO Update(BrandsDTO prices);
    void delete(Long id);
}
