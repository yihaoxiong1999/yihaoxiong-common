package com.yihaoxiong.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

  @Test
  public void testPhone() {
    String str = "93812345678";
    boolean b = StringUtil.isPhoneNumber(str);
    System.out.println(b);
  }

  @Test
  public void testEmail() {
    String str = "numbe@163com";
    boolean b = StringUtil.isEmail(str);
    System.out.println(b);
  }

  @Test
  public void testHasLength() {

    String str = " ";

    System.out.println(StringUtil.hasLength(str));
  }

  @Test
  public void testHasText() {
    String str = " ";

    System.out.println(StringUtil.hasText(str));
  }

  @Test
  public void testRandomChineseStringInt() {
    String string = StringUtil.randomChineseString(1000);
    System.out.println(string);
  }

  @Test
  public void testRandomChineseString() {
    for (int i = 0; i < 10; i++) {
      System.out.println(StringUtil.generateChineseName());
    }
  }

  /*
  * 编写一个Person类，里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)，共4个属性，然后批量生成1万个Person对象，要求：
  *姓名属性值调用StringUtil.generateChineseName()创建（4分）
  * 年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
  *介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
  *注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
  *批量生成1万个，并在控制台输出（4分）
     * @Title: testGenerate 
     * @Description: TODO
     * @return: void*/
  @Test
  public void testGenerateChineseName() {
    String name = "";
    Integer age = null;
    String about = "";
    Date regDate = null;

    Calendar c = Calendar.getInstance();
    c.set(2010, 0, 1);

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    for (int i = 0; i < 1000; i++) {
      name = StringUtil.generateChineseName();
      age = RandomUtils.random(1, 120);
      about = StringUtil.randomChineseString(140);
      regDate = DateUtil.randomDate(c.getTime(), new Date());
      System.out.println(df.format(regDate));

      Person person = new Person(name, age, about, regDate);
      //  System.out.println(person);
    }

  }

}
