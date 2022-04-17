package com.pavan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
