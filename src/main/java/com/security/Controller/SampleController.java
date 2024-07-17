package com.security.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {

    @GetMapping("/book")
    public ResponseEntity<String> getBook(){
        return new ResponseEntity<>("data book",HttpStatus.OK);
    }


    @GetMapping("/author")
    public ResponseEntity<String> getAuthor(){
        return new ResponseEntity<>("data author",HttpStatus.OK);
    }
}
