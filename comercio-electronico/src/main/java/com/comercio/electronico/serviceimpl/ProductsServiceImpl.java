package com.comercio.electronico.serviceimpl;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.dto.ProductsDTO;
import com.comercio.electronico.model.Prices;
import com.comercio.electronico.model.Products;
import com.comercio.electronico.repository.PricesRepository;
import com.comercio.electronico.repository.ProductsRepository;
import com.comercio.electronico.service.PricesService;
import com.comercio.electronico.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public List<ProductsDTO> getAllProducts() {
        List<ProductsDTO> products = productsRepository.findAll()
                .stream()
                .map(product -> modelMapper.map(product, ProductsDTO.class))
                .collect(Collectors.toList());
        return products;
    }

    @Override
    public Optional<ProductsDTO> findById(Integer id) {
        Optional<Products> products = productsRepository.findById(id);
        if (products.isEmpty()){
            throw new EntityNotFoundException("No se encontraron resultados.");
        }
        return products.map(b -> modelMapper.map(b, ProductsDTO.class));
    }

    @Override
    public ProductsDTO save(ProductsDTO prices) {
        return null;
    }

    @Override
    public ProductsDTO Update(ProductsDTO prices) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
