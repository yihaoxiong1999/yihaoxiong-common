package com.yihaoxiong.common.utils;

import java.io.File;

public class FileUtil {
  /*
  * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
  */
  public static String getExtendName(String fileName) {

    if (fileName != null && fileName.length() > 0) {
      return fileName.substring(fileName.indexOf("."));
    }
    //TODO 实现代码
    return null;
  }

  /*
  * 方法2：返回操作系统临时目录(5分)
  */
  public static File getTempDirectory() {
    String property = System.getProperty("java.io.tmpdir");
    return new File(property);
    //TODO 实现代码
  }

  /*
  * 方法3：返回操作系统用户目录(5分)
  * 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
  */
  public static File getUserDirectory() {
    String property = System.getProperty("user.home");

    return new File(property);
    //TODO 实现代码
  }

}
