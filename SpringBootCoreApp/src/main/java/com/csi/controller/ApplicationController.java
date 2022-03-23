package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/services")
    public String sayHello(){

        return "Welcomw to Fintech CSI";

    }
    @GetMapping("/address")
    public String sayAddress(){

        return "Pune";

    }

}
