package com.onurkenis.simpleservice.controller;

import com.onurkenis.simpleservice.entity.Simple;
import com.onurkenis.simpleservice.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    private SimpleService simpleService;

    @PostMapping("/simple")
    public ResponseEntity<Simple> save(@RequestBody Simple simple) {
        return new ResponseEntity<>(simpleService.save(simple), HttpStatus.CREATED);
    }

    @GetMapping("/simple")
    public ResponseEntity<List<Simple>> list() {
        return new ResponseEntity<>(simpleService.findAll(), HttpStatus.CREATED);
    }

    @GetMapping("/lists/{id}/items")
    public ResponseEntity<Simple> listItems(@PathVariable("id") Long id) {
        return new ResponseEntity<>(simpleService.get(id), HttpStatus.OK);
    }
}
