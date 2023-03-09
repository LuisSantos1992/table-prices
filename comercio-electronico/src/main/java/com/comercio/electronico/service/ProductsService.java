package com.comercio.electronico.service;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.dto.ProductsDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductsService {

    List<ProductsDTO> getAllProducts();
    Optional<ProductsDTO> findById(Integer id);
    ProductsDTO save(ProductsDTO prices);
    ProductsDTO Update(ProductsDTO prices);
    void delete(Long id);
}
