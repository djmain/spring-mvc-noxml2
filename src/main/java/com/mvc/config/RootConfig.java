package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * created by Jay on 2019/6/17
 */

@Configuration
@ComponentScan(basePackages = {"com.mvc"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)

public class RootConfig
{

}