package com.yihaoxiong.common.utils;

import org.junit.Test;

public class StringTest {
  //(1) 测试StringUtil工具类中toHtml()方法
  //传一段文本进去，输出带html标签的文本
  @Test
  public void testToHtml() {
    //定义文本
    String text = "abc";
    //调用工具类
    String html = StringUtil.toHtml(text);
    //输出
    System.out.println(html);
  }

}
