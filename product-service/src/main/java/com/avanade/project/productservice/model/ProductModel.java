package com.avanade.project.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author https://github.com/alisonrodolfo
 */
@Data
@Document("products")
public class ProductModel {
    /* Created by Alison on 12/02/2022 */
    @Id
    private String id;
    private String description;

}
