package com.example.products.controller;
import com.example.products.model.Category;
import com.example.products.model.Products;
import com.example.products.service.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/category")
    public ResponseEntity<?> getCategory(){
        return ResponseEntity.ok(categoryService.getAll());
    }

    @GetMapping("/api/category/{id}")
    public ResponseEntity<?> getCategory(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getById(id));
    }

    @PostMapping("/api/category")
    public ResponseEntity<?>  saveCategory(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.create(category));
    }

    @PutMapping("/api/category")
    public ResponseEntity<?> updateCategory(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.update(category));
    }

    @DeleteMapping("/api/category/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.delete(id);
    }
}


