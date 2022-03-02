package com.avanade.domain.cart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Status controller.
 */
@RestController
public class StatusController {

    /**
     * Message response entity.
     *
     * @return the response entity
     */
    @GetMapping("/status")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok("online");
    }


}
