package com.vishnuteja.footlights.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

record HelloResponse(String message) {}

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HelloResponse hello(@RequestParam(defaultValue = "world") String name){
        return new HelloResponse("Hello, " + name + "!");
    }
}
