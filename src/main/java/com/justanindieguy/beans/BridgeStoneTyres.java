package com.justanindieguy.beans;

import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

  @Override
  public void rotate() {
    System.out.println("Rotating BridgeStone Tyres!");
  }

}
