package org.example.springwebemptymappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {
     // everything is ok for the empty url mapping
    // if the class-level mapping exists
    @GetMapping
    public String fooRoot(@PathVariable String name) {
        return "foo root";
    }
    @GetMapping("/sub")
    public String subRoot() {
        return "foo subroot";
    }
}