package com.example.spring5_IOC.BeanAnnotation.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_IOC.BeanAnnotation.Config
 * @Author: hai
 * @CreateTime: 2023-03-17  14:27
 * @Version: 1.0
 */

@Configuration //作为配置类，替代xml文件
@ComponentScan(basePackages = "com.example.spring5_IOC")
public class SpringConfig {

}
