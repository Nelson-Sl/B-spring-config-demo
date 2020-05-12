package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/port")
    public int getPort() {
        return serverPort;
    }
}
