package com.justanindieguy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {

  @Override
  public void rotate() {
    System.out.println("Rotating Michelin Tyres!");
  }

}
