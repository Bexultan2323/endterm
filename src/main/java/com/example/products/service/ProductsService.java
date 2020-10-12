package com.example.products.service;

import com.example.products.model.Products;
import com.example.products.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    public final ProductsRepository productsRepository;


    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> getAll(){
        return productsRepository.findAll();
    }
    public Products getById(Long id){
        return productsRepository.findById(id).orElse(null);
    }

    public Products create(Products products){
        return productsRepository.save(products);
    }
    public Products update(Products products){
        return productsRepository.save(products);
    }
    public void delete(Long id){
        productsRepository.deleteById(id);
    }
}
