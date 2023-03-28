package com.example.functions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.functions
 * @Author: hai
 * @CreateTime: 2023-03-28  15:25
 * @Version: 1.0
 */


public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("log4j2");
        log.warn("w log4j2");
    }
}
