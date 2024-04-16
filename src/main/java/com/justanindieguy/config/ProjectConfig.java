package com.justanindieguy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.justanindieguy.implementation",
    "com.justanindieguy.services" })
@ComponentScan(basePackageClasses = { com.justanindieguy.beans.Person.class,
    com.justanindieguy.beans.Vehicle.class })
public class ProjectConfig {
}
