package com.yihaoxiong.common.utils;

import org.junit.Test;

public class RandomUtilsTest {

  @Test
  public void testRandom() {
    for (int i = 0; i < 10; i++) {
      int random = RandomUtils.random(0, 9);
      System.out.println(random);
    }
  }

  @Test
  public void testSubRandom() {
    int[] subRandom = RandomUtils.subRandom(1, 10, 3);
    for (int i : subRandom) {
      System.out.println(i + "");
    }
  }

  @Test
  public void testRandomCharacter() {
    char c = RandomUtils.randomCharacter();
    System.out.println(c);
  }

  @Test
  public void testRandomString() {
    String string = RandomUtils.randomString(4);
    System.out.println(string);
  }

}
