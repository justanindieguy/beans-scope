package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
  }

}