package com.justanindieguy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;
import com.justanindieguy.interfaces.Tyres;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {

  private final Speakers speakers;
  private final Tyres tyres;

  @Autowired
  public VehicleServices(Speakers speakers, Tyres tyres) {
    this.speakers = speakers;
    this.tyres = tyres;
  }

  public void playMusic() {
    String music = speakers.makeSound();
    System.out.println(music);
  }

  public void moveVehicle() {
    String status = tyres.rotate();
    System.out.println(status);
  }

  public Speakers getSpeakers() {
    return speakers;
  }

  public Tyres getTyres() {
    return tyres;
  }

}
