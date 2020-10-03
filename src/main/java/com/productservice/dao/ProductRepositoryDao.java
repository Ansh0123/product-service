package com.productservice.dao;

import com.productservice.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryDao extends CrudRepository<Product, Integer> {
}
