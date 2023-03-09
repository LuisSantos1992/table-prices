package com.comercio.electronico.serviceimpl;

import com.comercio.electronico.dto.PriceDTO;
import com.comercio.electronico.model.Prices;
import com.comercio.electronico.repository.PricesRepository;
import com.comercio.electronico.service.PricesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PricesServiceImpl implements PricesService {

    @Autowired
    PricesRepository pricesRepository;

    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public List<PriceDTO> getAllPrices() {
        List<PriceDTO> prices = pricesRepository.findAll()
                .stream()
                .map(price -> modelMapper.map(price, PriceDTO.class))
                .collect(Collectors.toList());
        return prices;
    }

    @Override
    public Optional<PriceDTO> findById(Integer id) {
        Optional<Prices> prices = pricesRepository.findById(id);
        if (prices.isEmpty()){
            throw new EntityNotFoundException("No se encontraron resultados.");
        }
        return prices.map(b -> modelMapper.map(b, PriceDTO.class));
    }

    @Override
    public PriceDTO save(PriceDTO prices) {
        return null;
    }

    @Override
    public PriceDTO Update(PriceDTO prices) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
