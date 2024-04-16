package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value = "personBean")
public class Person {

  private String name;
  private final Vehicle vehicle;

  @Autowired
  public Person(Vehicle vehicle) {
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
