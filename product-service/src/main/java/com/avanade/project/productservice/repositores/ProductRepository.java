package com.avanade.project.productservice.repositores;

import com.avanade.project.productservice.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author https://github.com/alisonrodolfo
 */
@Repository
public interface ProductRepository extends MongoRepository<ProductModel, Long> {
    /* Created by Alison on 12/02/2022 */
    Optional<ProductModel> findByDescription(String description);

}
