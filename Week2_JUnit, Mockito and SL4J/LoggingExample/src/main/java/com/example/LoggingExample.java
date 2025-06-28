package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}

//20:32:56.285 [main] ERROR com.example.LoggingExample - This is an error message
//20:32:56.289 [main] WARN com.example.LoggingExample - This is a warning message
