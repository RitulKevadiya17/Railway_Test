package com.example.railwattest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailwayTestController {

    @GetMapping("hello")
    public String getString(){
        return "this is string from railway server testinf this is free✔✔✔✔😂😂";
    }
}
