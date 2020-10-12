package com.example.products.repository;

import com.example.products.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {
    List<Products> findAll();
}

