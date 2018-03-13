package com.bklkj.Commons.msgUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 
 * @author fan
 *
 */
public class TransUtils {

	/**
	 * @param mobile
	 * @return
	 */
	public static boolean isMobile(String mobile) {
		String PHONE_PATTERN = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17([0,1,6,7,]))|(18[0-2,5-9]))\\d{8}$";
		boolean bool = Pattern.compile(PHONE_PATTERN).matcher(mobile).matches();
		if (bool)
			return true;
		else
			return false;

	}
	/**
	 * @return
	 */
	public static String random6(){
		int i = (int)((Math.random()*9+1)*100000);
		return String.valueOf(i);
		
	}

	/**
	 * @param format
	 * @return
	 */
	
	public static String getNowDate(String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(new Date());
	}
	public static void main(String[] args) {
		System.out.println((int)((Math.random()*9+1)*100000)); 
	}
}
