package com.comercio.electronico.serviceimpl;

import com.comercio.electronico.dto.BrandsDTO;
import com.comercio.electronico.dto.ProductsDTO;
import com.comercio.electronico.model.Brands;
import com.comercio.electronico.model.Products;
import com.comercio.electronico.repository.BrandsRepository;
import com.comercio.electronico.repository.ProductsRepository;
import com.comercio.electronico.service.BrandsService;
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
public class BrandsServiceImpl implements BrandsService {

    @Autowired
    BrandsRepository brandsRepository;

    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public List<BrandsDTO> getAllBrands() {
        List<BrandsDTO> brands = brandsRepository.findAll()
                .stream()
                .map(brand -> modelMapper.map(brand, BrandsDTO.class))
                .collect(Collectors.toList());
        return brands;
    }

    @Override
    public Optional<BrandsDTO> findById(Integer id) {
        Optional<Brands> products = brandsRepository.findById(id);
        if (products.isEmpty()){
            throw new EntityNotFoundException("No se encontraron resultados.");
        }
        return products.map(b -> modelMapper.map(b, BrandsDTO.class));
    }

    @Override
    public BrandsDTO save(BrandsDTO brands) {
        return null;
    }

    @Override
    public BrandsDTO Update(BrandsDTO brands) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
