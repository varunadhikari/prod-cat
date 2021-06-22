package com.product.productcat.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.product.productcat.enums.CategoryEnum;

@Entity(name = "PROD_CATEGORY")
@Table
public class ProductCategory {
	
	@Id
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private CategoryEnum type;
	
	@OneToOne(mappedBy = "category")
	private Product product;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CategoryEnum getType() {
		return type;
	}
	public void setType(CategoryEnum type) {
		this.type = type;
	}
	
}
