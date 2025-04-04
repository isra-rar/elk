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

    @GetMapping("/log/error")
    public String generateLog() {
        logger.error("Este é um log de ERROR");
        return "Logs gerados!";
    }


    @GetMapping("/log/warn")
    public String generateLogWarn() {
        logger.warn("Este é um log de WARN");
        return "Logs gerados!";
    }

    @GetMapping("/log/info")
    public String generateLogInfo() {
        logger.info("Este é um log de INFO");
        return "Logs gerados!";
    }
}
