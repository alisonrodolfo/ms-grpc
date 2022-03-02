package com.avanade.domain.cart.controller;

import com.avanade.domain.cart.data.ProductData;
import com.avanade.domain.cart.grpc.ProductGrpc;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * The type Cart controller.
 */
@RestController
@RequestMapping("/api/cart")
@OpenAPIDefinition(info = @Info(title = "Cart Controller", version = "1.0", description = ""))
public class CartController {

    private final ProductGrpc productGrpc;

    /**
     * Instantiates a new Cart controller.
     *
     * @param productGrpc the product grpc
     */
    public CartController(ProductGrpc productGrpc) {
        this.productGrpc = productGrpc;
    }

    /**
     * Find product by description response entity.
     *
     * @param description the description
     * @return the response entity
     */
    @GetMapping("/product-by-description")
    public ResponseEntity<Optional<ProductData>> findProductByDescription(@RequestParam String description) {
        return ResponseEntity.ok(productGrpc.receiveProductByDescription(description));
    }

}
