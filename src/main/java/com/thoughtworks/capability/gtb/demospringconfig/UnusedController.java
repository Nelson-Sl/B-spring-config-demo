package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.web.bind.annotation.GetMapping;

public class UnusedController {

    @GetMapping("/nothing")
    public String nothing() {
        return "nothing here~";
    }
}
