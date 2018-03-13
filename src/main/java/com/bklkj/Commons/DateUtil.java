package com.bklkj.Commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private static SimpleDateFormat sdf = null;
	
	static {
		sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	Date date = new Date();
	//��������ת�����ַ��������
	public static String getDateTime(Date date) {
		String line = null;
		if(null != date) {
			 line = sdf.format(date);
		}
		return line;
	}
	
	//���ַ��������ת����������
	public static Date getStringTime(String line) {
		Date date = null;
		if(!"".equals(line) && null != line) {
			try {
				 date = sdf.parse(line);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	
}
