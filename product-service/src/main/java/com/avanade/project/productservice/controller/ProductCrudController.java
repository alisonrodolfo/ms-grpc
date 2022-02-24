package com.avanade.project.productservice.controller;

import com.avanade.project.productservice.model.ProductModel;
import com.avanade.project.productservice.repositores.ProductRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author https://github.com/alisonrodolfo
 */
@RestController
@RequestMapping("/api/product-crud")
@OpenAPIDefinition(info = @Info(title = "API Avanade", version = "1.0", description = ""))
public class ProductCrudController {

    private final ProductRepository repository;

    public ProductCrudController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list-all")
    public List<ProductModel> listAll() {
        return repository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product) {
        return ResponseEntity.ok(repository.save(product));
    }
}
