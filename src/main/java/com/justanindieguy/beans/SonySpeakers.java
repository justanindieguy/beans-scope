package com.justanindieguy.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;

@Component
@Primary
public class SonySpeakers implements Speakers {

  @Override
  public void makeSound() {
    System.out.println("Playing music from Sony Speakers!");
  }

}
