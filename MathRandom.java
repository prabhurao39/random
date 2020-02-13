package com.basic.random;


public class MathRandom {
  public static void main(String[] args) {
    double random = Math.random();
    for (int i = 0; i < 3; i++) {
      System.out
          .println(getRandomNumberInRange(1, 231) + "  pseudo random int in a range : " + random);
    }
  }

  private static int getRandomNumberInRange(int min, int max) {
    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }
}
