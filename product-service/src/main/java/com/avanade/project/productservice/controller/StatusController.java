package com.avanade.project.productservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://github.com/alisonrodolfo
 */
@RestController
public class StatusController {
    /* Created by Alison on 12/02/2022 */
    @GetMapping("/status")
    public ResponseEntity<String> message(){
        return ResponseEntity.ok("Online");
    }
}
