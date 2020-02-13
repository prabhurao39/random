package com.basic.random;

import java.util.Random;

public class UtilRandom {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 3; i++) {
      int randomInteger = random.nextInt();
      System.out.println(
          getRandomNumberInRange(1, 25) + " pseudo random int in a range : " + randomInteger);
    }
  }

  private static int getRandomNumberInRange(int min, int max) {
    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

}
