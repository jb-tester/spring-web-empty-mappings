package org.example.springwebemptymappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    // no endpoint shown in Endpoints
    // no gutter icon for method
    // no error for the missing path template matching @PathVariable
    // Structure shows the endpoint, but incorrect HTTP request is generated in the
    @GetMapping
    public String root(@PathVariable String name) {
        return "root";
    }

    // this mapping is shown in Endpoints, but other problems are the same
    @GetMapping("/")
    public String rootWithSlash(@PathVariable String name) {
        return "root";
    }

    // this mapping is shown in Endpoints, but other problems are the same
    @GetMapping("")
    public String rootWithEmpty(@PathVariable String name) {
        return "root";
    }
    @GetMapping("/sub")
    public String subRoot() {
        return "subroot";
    }

}