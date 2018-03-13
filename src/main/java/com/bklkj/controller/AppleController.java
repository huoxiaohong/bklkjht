package com.bklkj.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bklkj.Commons.Apple;
import com.bklkj.Commons.Forget;
import com.bklkj.service.AlipayService;
  
  
@Controller
@RequestMapping("apple")
public class AppleController {
	
	@Autowired
	private AlipayService alipayService;

	
	@RequestMapping("apple")
	@ResponseBody
	public Apple apple(@RequestParam(value = "userid", required = false)String userid,
			@RequestParam(value = "receipt-data", required = false)String receiptData,Apple ae,
			HttpServletRequest request){
		receiptData = "{\"receipt-data\":\""+receiptData.substring(0,receiptData.length())+"\"}";
		String url = "https://sandbox.itunes.apple.com/verifyReceipt";
		JSONObject s = sendPost(url,receiptData);
		String content = (String) request.getSession().getAttribute("content");
		String status = (String) request.getSession().getAttribute("status");
		int i = Integer.parseInt(status);
		System.err.println(i);
		if(i==0){
			if(content.equals("QiangQiang1")){
			alipayService.update10(userid);
			ae.setCode(1);
			ae.setMessage("充值1元成功");
			}
			else if(content.equals("QiangQiang6")){
				alipayService.update60(userid);
				ae.setCode(1);
				ae.setMessage("充值6元成功");
				}
			else if(content.equals("QiangQiang18")){
				alipayService.update198(userid);
				ae.setCode(1);
				ae.setMessage("充值18元成功");
				}
			else if(content.equals("QiangQiang30")){
				alipayService.update388(userid);
				ae.setCode(1);
				ae.setMessage("充值30元成功");
				}
			else if(content.equals("QiangQiang68")){
				alipayService.update998(userid);
				ae.setCode(1);
				ae.setMessage("充值68元成功");
				}
			else if(content.equals("QiangQiang128")){
				alipayService.update1988(userid);
				ae.setCode(1);
				ae.setMessage("充值128元成功");
				}
			
		}else if(i!=0){
		ae.setCode(0);
		ae.setMessage("充值失败");
		}
        return ae;
    }

	public static synchronized JSONObject sendPost(String url, String param) { 
		//JSONObject jsStr = JSONObject.parseObject(param);
			//param = jdkBase64Encoder(param);
	        StringBuilder sb = new StringBuilder();    
	        PrintWriter out = null;    
	        BufferedReader in = null;    
	        try {    
	            URL realUrl = new URL(url);   
	            // 打开和URL之间的连接    
	            URLConnection conn = realUrl.openConnection();    
	            // 设置通用的请求属性    
	            conn.setRequestProperty("accept", "*/*");    
	            conn.setRequestProperty("connection", "Keep-Alive");    
	            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");    
	            // 发送POST请求必须设置如下两行    
	            conn.setDoOutput(true);    
	            conn.setDoInput(true);    
	            // 获取URLConnection对象对应的输出流    
	            out = new PrintWriter(conn.getOutputStream());    
	            // 发送请求参数    
	            out.print(param);    
	            // flush输出流的缓冲    
	            out.flush();    
	            // 定义BufferedReader输入流来读取URL的响应    
	            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));    
	            String line;    
	            sb = new StringBuilder();   
	            while ((line = in.readLine()) != null)   
	            {  
	                sb.append(line);    
	            }    
	        } catch (Exception e) {    
	           // System.out.println("发送 POST 请求出现异常！"+e);    
	            e.printStackTrace();    
	        }    
	        //使用finally块来关闭输出流、输入流    
	        finally{    
	            try{    
	                if(out!=null){    
	                    out.close();    
	                }    
	                if(in!=null){    
	                    in.close();    
	                }    
	            }    
	            catch(IOException ex){    
	                ex.printStackTrace();    
	            }    
	        }    
	        
	        JSONObject code = JSON.parseObject((String) sb.toString());
			JSONObject id = code.getJSONObject("receipt").getJSONArray("in_app").getJSONObject(0);
			String content = id.getString("product_id");
			System.out.println(content);
			System.err.println(id);
			System.err.println(code);
			String status = code.getString("status");
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("content", content);
			session.setAttribute("status", status);
	        return JSON.parseObject((String) sb.toString());    
	    }
	      
	
	
	
}
