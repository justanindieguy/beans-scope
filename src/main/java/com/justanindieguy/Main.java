package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Person;
import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    System.out.println("Before retrieving the Person Bean from the Spring Context");
    Person person = context.getBean(Person.class); // <- Person Bean is created before trying to access it.
    System.out.println("After retrieving the Person Bean from the Spring Context");
  }

}