package com.fastcampus.programming.dmaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class DMakerController {

    @GetMapping("/developers")
    public List<String>  getAllDevelopers(){
        log.info("GET / developers_HTTP/1.1");

        return Arrays.asList("snow", "Elsa", "Olaf");
    }
}
