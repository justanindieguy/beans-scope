package com.justanindieguy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;
import com.justanindieguy.config.ProjectConfig;
import com.justanindieguy.services.VehicleServices;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    String[] persons = context.getBeanNamesForType(Person.class);
    String[] vehicles = context.getBeanNamesForType(Vehicle.class);
    System.out.println(Arrays.toString(persons));
    System.out.println(Arrays.toString(vehicles));

    Person person = context.getBean(Person.class);
    System.out.println("Person bean from Context: " + person);

    Vehicle vehicle = person.getVehicle();
    VehicleServices vehicleServices = vehicle.getVehicleServices();
    vehicleServices.playMusic();
    vehicleServices.moveVehicle();
  }

}