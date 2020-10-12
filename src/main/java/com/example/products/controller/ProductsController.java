package com.example.products.controller;
import com.example.products.model.Products;
import com.example.products.service.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/api/products")
    public ResponseEntity<?> getProducts(){
        return ResponseEntity.ok(productsService.getAll());
    }

    @GetMapping("/api/products/{id}")
    public ResponseEntity<?> getProducts(@PathVariable Long id){
        return ResponseEntity.ok(productsService.getById(id));
    }

    @PostMapping("/api/products")
    public ResponseEntity<?>  saveProducts(@RequestBody Products products){
        return ResponseEntity.ok(productsService.create(products));
    }

    @PutMapping("/api/products")
    public ResponseEntity<?> updateProducts(@RequestBody Products products){
        return ResponseEntity.ok(productsService.update(products));
    }

    @DeleteMapping("/api/products/{id}")
    public void deleteProducts(@PathVariable Long id) {
        productsService.delete(id);
    }
}


