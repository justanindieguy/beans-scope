package com.justanindieguy.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;

@Component
@Primary
public class SonySpeakers implements Speakers {

  @Override
  public String makeSound() {
    return "Playing music from Sony speakers!";
  }

}
