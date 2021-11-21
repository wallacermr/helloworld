package br.com.gen.hellomessage.controller;

import br.com.gen.hellomessage.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    private HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok(service.getHello());
    }
}
