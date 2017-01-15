package com.star.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hp on 2017/1/13.
 */
//启用Spring的配置扫描
@Configuration
//启用Spring的包扫描，basePackages属性不写的话默认扫描当前包下
@ComponentScan(basePackages = {"com.star.soundsystem","com.star.config"})
public class CDPlayerConfig {
}
