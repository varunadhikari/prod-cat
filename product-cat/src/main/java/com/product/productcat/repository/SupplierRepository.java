package com.product.productcat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.productcat.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
