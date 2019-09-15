package com.yihaoxiong.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:衣豪雄(1315712803@qq.com)
 * <br>Date:2019年9月6日
 */
public class DateUtil {

  /**
   * 
   * <br>Description:TODO 当前日期减去对应月份
   * <br>Author:衣豪雄(1315712803@qq.com)
   * <br>Date:2019年9月15日
   * @param src
   * @return
   */
  public static Date getDateByMonthSub(Date date, Integer month) {
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.MONTH, -month);
    return c.getTime();
  }

  /*
  * 方法1：(5分)
  * 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
  * 则返回的结果为2019-05-01 00:00:00
  */
  public static Date getDateByInitMonth(Date src) {
    Calendar c = Calendar.getInstance();
    c.setTime(src);

    c.set(Calendar.DAY_OF_MONTH, 1);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);

    return c.getTime();
    //用当前系统时间获取日历类

  }

  /*
  * 方法2：(5分)
  * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
  * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
  * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
  */
  public static Date getDateByFullMonth(Date src) {
    Calendar c = Calendar.getInstance();
    c.setTime(src);

    c.set(c.YEAR, 2018);

    c.add(Calendar.MONTH, 1);

    Date date = getDateByInitMonth(c.getTime());
    c.setTime(date);
    c.add(Calendar.SECOND, -1);
    return c.getTime();

  }
  //思考题:随机返回18-60岁之间的日期

  //随机产生在某个时间段内的日期
  public static Date randomDate(Date minDate, Date maxDate) {

    Calendar c1 = Calendar.getInstance();

    //获取开始的时间的毫米数
    long l1 = minDate.getTime();
    //获取结束时间的毫米数
    long l2 = maxDate.getTime();

    //随机产生一个l1和l2之间的随机数据 l3

    long l3 = (long) ((Math.random() * (l2 - l1 + 1)) + l1);
    //用毫秒 初始化日历类
    c1.setTimeInMillis(l3);

    return c1.getTime();

  }

}
