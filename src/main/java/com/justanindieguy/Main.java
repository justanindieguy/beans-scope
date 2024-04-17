package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.config.ProjectConfig;
import com.justanindieguy.services.VehicleServices;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
    VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
    System.out.println("Hashcode of the object vehicleServices1: " + vehicleServices1.hashCode());
    System.out.println("Hashcode of the object vehicleServices2: " + vehicleServices2.hashCode());

    if (vehicleServices1 == vehicleServices2) {
      System.out.println("VehicleServices Bean is a Singleton scoped Bean");
    } else {
      System.out.println("VehicleServices Bean is a Prototype scoped Bean");
    }
  }

}