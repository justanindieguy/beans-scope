package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;
import com.justanindieguy.beans.VehicleServices;
import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Person person = context.getBean(Person.class);
    System.out.println("Person bean from Context: " + person);

    Vehicle vehicle = person.getVehicle();
    VehicleServices vehicleServices = vehicle.getVehicleServices();
    vehicleServices.getSpeakers().makeSound();
    vehicleServices.getTyres().rotate();
  }

}