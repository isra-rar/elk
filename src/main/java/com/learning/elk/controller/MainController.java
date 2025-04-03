package com.learning.elk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/log")
    public String generateLog() {
        logger.info("Este é um log de INFO");
        logger.warn("Este é um log de WARN");
        logger.error("Este é um log de ERROR");
        return "Logs gerados!";
    }
}
