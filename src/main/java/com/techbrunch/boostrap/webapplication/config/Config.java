package com.techbrunch.boostrap.webapplication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author TechBrunch
 * This class is the config class used to declare Component scan and Spring related configurations
 * which can also be done using xml.
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.techbrunch.boostrap.webapplication")
public class Config {

}
