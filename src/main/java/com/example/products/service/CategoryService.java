package com.example.products.service;

import com.example.products.model.Category;
import com.example.products.model.Products;
import com.example.products.repository.CategoryRepository;
import com.example.products.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    public final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }
    public Category getById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Category create(Category category){
        return categoryRepository.save(category);
    }
    public Category update(Category category){
        return categoryRepository.save(category);
    }
    public void delete(Long id){
        categoryRepository.deleteById(id);
    }
}
