package com.learning.demo.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
    private static final Logger LOGGER = LogManager.getLogger(LogUtil.class);
    public static void infoLog()
    {
        LOGGER.info("Info level log message");
    }
    public static void errorLog()
    {
        LOGGER.error("eror level log message");
    }
}
