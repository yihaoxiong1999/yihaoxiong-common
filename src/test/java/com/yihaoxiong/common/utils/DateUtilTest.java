package com.yihaoxiong.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

  @Test
  public void getDateByInitMonth() {
    Calendar c = Calendar.getInstance();
    c.set(1999, 1, 12);

    Date date = DateUtil.getDateByInitMonth(c.getTime());
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format = df.format(date);
    System.out.println(format);
  }

  @Test
  public void getDateByFullMonth() {

    Date date = DateUtil.getDateByFullMonth(new Date());

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format = df.format(date);
    System.out.println(format);
  }

}
