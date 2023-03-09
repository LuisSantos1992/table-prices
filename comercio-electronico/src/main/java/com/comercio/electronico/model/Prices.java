package com.comercio.electronico.model;

import java.time.LocalDateTime;
import java.util.Date;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="prices")
public class Prices {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer priceList;
	private String name;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime startDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endDate;
	private int priority;
	private Double price;
	private String curr;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduct")
	private Products product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idBrand")
	private Brands brand;

}
