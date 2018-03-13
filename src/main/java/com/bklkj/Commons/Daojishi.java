package com.bklkj.Commons;

import java.util.Calendar;
import java.util.Date;

public class Daojishi {
	public static int time = 60 * 60 * 60;
    public static Calendar c;
    public static long endTime;
    public static Date date;
   public static long startTime;
    public static long midTime;

   public static void main(String[] args) {
       c = Calendar.getInstance();
       c.set(2017, 12, 10, 14, 0, 0);// 注意月份的设置，0-11表示1-12月
        // c.set(Calendar.YEAR, 2017);
        // c.set(Calendar.MONTH, 4);
        // c.set(Calendar.DAY_OF_MONTH, 17);
        // c.set(Calendar.HOUR_OF_DAY, 0);
        // c.set(Calendar.MINUTE, 0);
        // c.set(Calendar.SECOND, 0);
        endTime = c.getTimeInMillis();
        date = new Date();
        startTime = date.getTime();
        midTime = (endTime - startTime) / 1000;

        // time1();//方式一
        	time1();// 方式二
        // time3();//方式三
   }
private static void time1() {
	          while (time > 0) {
	        	  	time--;
	             try {
	                  Thread.sleep(1000);
	                  int hh = time / 60 / 60 % 60;
	                  int mm = time / 60 % 60;
	                  int ss = time % 60;
	                  System.out.println("还剩" + hh + "小时" + mm + "分钟" + ss + "秒");
	              } catch (InterruptedException e) {
	                  e.printStackTrace();
	              }
	          }
	  
	      }
}
