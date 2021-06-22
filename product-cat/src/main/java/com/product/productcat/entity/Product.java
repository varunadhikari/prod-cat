package com.product.productcat.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.product.productcat.enums.BrandEnum;
import com.product.productcat.enums.SizeEnum;

@Entity
@Table
public class Product {

	@Id
	private Integer sku;
	
	@Enumerated(EnumType.STRING)
	private BrandEnum brand;
	
	private Double price;
	
	private String color;
	
	@Enumerated(EnumType.STRING)
	private SizeEnum size;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "product_supplier",
    joinColumns = {
            @JoinColumn(name = "product_id", referencedColumnName = "sku",
                    nullable = false, updatable = false)},
    inverseJoinColumns = {
            @JoinColumn(name = "supplier_id", referencedColumnName = "id",
                    nullable = false, updatable = false)})
	private Set<Supplier> supplier = new HashSet<>();;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
	private ProductCategory category;
	
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public BrandEnum getBrand() {
		return brand;
	}
	public void setBrand(BrandEnum brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public SizeEnum getSize() {
		return size;
	}
	public void setSize(SizeEnum size) {
		this.size = size;
	}
	public Set<Supplier> getSupplier() {
		return supplier;
	}
	public void setSupplier(Set<Supplier> supplier) {
		this.supplier = supplier;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
}
