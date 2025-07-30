package com.lcwd.gateway.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<Void> redirectToIndex() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .header("Location", "/index.html")
                .build();
    }
}
