package com.comercio.electronico.repository;

import com.comercio.electronico.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PricesRepository extends JpaRepository<Prices,Integer> {

    //p.brand.brandId=:brandId and p.product.id=:idProduct
    @Query(value="select p from Prices p where p.startDate <= :startDate and p.endDate >= :endDate and p.brand.brandId=:brandId and p.product.prodId=:idProduct")
    List<Prices> findPricesPromotion(@Param("brandId") Integer brandId, @Param("idProduct") Integer idProduct,
                                     @Param("startDate") Date startDate,
                                     @Param("endDate") Date endDate);
}
