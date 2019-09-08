package com.yihaoxiong.common.utils;

import java.util.Date;

public class Person {
  //编写一个Person类，里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)，共4个属性
  private String name;

  private String age;

  private String anout;

  private String regdate;

  public Person() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Person(String name, String age, String anout, String regdate) {
    super();
    this.name = name;
    this.age = age;
    this.anout = anout;
    this.regdate = regdate;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", anout=" + anout + ", regdate=" + regdate + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAnout() {
    return anout;
  }

  public void setAnout(String anout) {
    this.anout = anout;
  }

  public String getRegdate() {
    return regdate;
  }

  public void setRegdate(String regdate) {
    this.regdate = regdate;
  }

  public Person(String name, Integer age, String about, Date regDate) {
    // TODO Auto-generated constructor stub
  }

}
