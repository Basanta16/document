package com.basanta.document.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class documentController {


    @GetMapping("/user")
    public ResponseEntity<String> noremaluser(){

        return ResponseEntity.ok("Yes, I am normal user!!!");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){

        return ResponseEntity.ok("Yes, I am admin user!!!");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){

        return ResponseEntity.ok("Yes, I am public user!!!");
    }

}
