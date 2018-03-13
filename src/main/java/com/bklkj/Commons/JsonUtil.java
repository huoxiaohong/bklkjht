package com.bklkj.Commons;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonUtil {

	private static ObjectMapper om = new ObjectMapper();
	static{
		om.setSerializationInclusion(Include.NON_NULL);
	}
	//����תJSOn
	public static String objectToJson(Object obj){
		try {
			return om.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//jsonת����
	public static <T> T jsonToObject(String json,Class<T> javaType){
		T t = null;
		try {
			t = om.readValue(json, javaType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
}
