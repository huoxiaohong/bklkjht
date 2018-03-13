package com.bklkj.Commons.msgUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IsOneDay {
	public static boolean isToday(Date date){
	     SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
	     if(fmt.format(date).toString().equals(fmt.format(new Date()).toString())){//格式化为相同格式
	          return true;
	      }else {
	        return false;
	      }
	  }
}

