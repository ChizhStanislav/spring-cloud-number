package com.example.springcloudnumber.controller;

import com.example.springcloudnumber.entity.Number;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("number")
public class NumberRestController {

    @Value("${name.service}")
    private String service;

    @GetMapping()
    public Number getNumber() {
        return Number.builder()
                .name(String.format("%s 8 029 311 30 69", service))
                .build();
    }
}
