package com.comercio.electronico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="brands")
public class Brands {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer brandId;
	private String name;

}
