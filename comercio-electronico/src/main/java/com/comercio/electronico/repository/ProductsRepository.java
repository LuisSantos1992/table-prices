package com.comercio.electronico.repository;

import com.comercio.electronico.model.Prices;
import com.comercio.electronico.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
