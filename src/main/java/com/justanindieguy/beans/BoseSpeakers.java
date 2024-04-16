package com.justanindieguy.beans;

import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

  @Override
  public void makeSound() {
    System.out.println("Playing music from Bose Speakers!");
  }

}
