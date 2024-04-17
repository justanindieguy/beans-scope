package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value = "personBean")
@Lazy
public class Person {

  private String name;
  private final Vehicle vehicle;

  @Autowired
  public Person(Vehicle vehicle) {
    System.out.println("Person Bean created by Spring!");
    this.vehicle = vehicle;
  }

  @PostConstruct
  public void initialize() {
    name = "John";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }

}
