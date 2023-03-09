package com.comercio.electronico.repository;

import com.comercio.electronico.model.Brands;
import com.comercio.electronico.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands,Integer> {
}
