package com.bklkj.Commons;

import java.util.UUID;
/**
 * ���Ψһ�ַ� :UUID
 * @author xiaoqian1
 *
 */
public class UUIDUtil {

	public static String getUUIDString() {
		String newUUIDString = UUID.randomUUID().toString().replaceAll("-", "");
		return newUUIDString;
	}
}
