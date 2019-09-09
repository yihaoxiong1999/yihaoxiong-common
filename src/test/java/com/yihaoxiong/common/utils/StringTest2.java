package com.yihaoxiong.common.utils;

import org.junit.Test;

public class StringTest2 {

  @Test //测试手机号
  public void testIsPhoneNumber() {
    //定义一个手机号
    String number = "18360234312";
    //调用工具类 
    boolean phoneNumber = StringUtil.isPhoneNumber(number);
    //输出结果
    System.out.println(phoneNumber);

  }

  @Test //测试电子邮件
  public void testIsEmail() {
    //定义一个电子邮件
    String email = "a1315712803@qq.com";
    //调用工具类 
    boolean email2 = StringUtil.isEmail(email);
    //输出结果
    System.out.println(email2);
  }

}
