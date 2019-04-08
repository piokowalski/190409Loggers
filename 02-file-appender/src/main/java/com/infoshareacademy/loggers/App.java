package com.infoshareacademy.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("file-appender");

        logger.info("This is an info message");
        logger.warn("This is a warning!");
        logger.error("Error!");
        logger.debug("This is a special top secret debug message only for developers");
    }
}
