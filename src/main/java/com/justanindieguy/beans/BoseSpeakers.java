package com.justanindieguy.beans;

import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

  @Override
  public String makeSound() {
    return "Playing music from Bose Speakers!";
  }

}
