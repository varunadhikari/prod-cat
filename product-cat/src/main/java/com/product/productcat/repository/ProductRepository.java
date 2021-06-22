package com.product.productcat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.productcat.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
