package com.example.spring5_AOP.AspectJ.anno.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ.anno.Config
 * @Author: hai
 * @CreateTime: 2023-03-17  17:02
 * @Version: 1.0
 */

@Configuration
@ComponentScan(basePackages = {"com.example"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
