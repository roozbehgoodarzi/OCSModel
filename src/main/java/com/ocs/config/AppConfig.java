package com.ocs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Goodarzi on 12/18/14.
 */
@Configuration
@ComponentScan({"com.ocs","com.ocs.spring.dao.hibernateImpl","com.ocs.spring.service"})
@EnableWebMvc
//@ImportResource("classpath:testContext.xml")
public class AppConfig {
}
