package com.bklkj.alipay;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeFastpayRefundQueryModel;
import com.alipay.api.domain.AlipayTradeQueryModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;

public class AlipayUtil {
	


	private static String APPID = "2017111309902205";


	private static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJ7gjnf7oqUv8V6WrL0rbdtiNfk8TVzbw86TJTxf9rzHU3aKuOdlFUUwuoG5UWGVwCJfPNL4RZ9JP7e0GzalAlJrNL+4O2i+mVD5/rLHQheFV+iU6CnJ1U/CXV/FF/cgpa74yPLoV0c0TQ6zwJJXcH4+mGD9CKYhCtBPjIGWWDuqUPIjYv65BvUBExyeT0AJA9HlUZksDwsKRXxdAMKAQAyR1GvPvSZ82PpzlPi25sPlz3S93doy293UZGtrHbM1KTnRcwFjlniiz9xNqbro2Rq/XxX1/DsQ5lv83tHnAyC0IU7hN/pk79+PUYo9vHxnt/PRvAGIsPDVqReJjCmct3AgMBAAECggEAaAW/bWgk7NqfStU5F/MYuukskF6Pane46W8t54RB9/jAxkMIb27IM4JWHjh/HaWOgIhC8JJPjNAp8tWoXTlmrD4dpsZPNZMbXLHl96UVCFEKmV3QeizHc1qe5l1e0XEeYiqbpTh+qa5tTeq64mMA/FBkxBiVPGhtDy/auH5+0vL/d2Zjgcbhv3Tq+g7oHy2L6oS01EgPh769+Yh/sA9IRIR/7L5cgppcX2LEi5yZHXJh7LX4uTedd6FmUP4LgaFf02CdWBASgFX+8RehbdwRMjPeZh9bkRoRczz1sAY56BkU/GyBsnYcmtXJc6l2knzbvULQW9RivU2hddgSJfVpgQKBgQD6PzJUVtYM0D0pdcMeGjpgn/DiFRPsl+W8psx8UqUSAgeGYbct3CpizzcqEY1/E5HCQmTEKJX0RAyAVMSNsgepWms356cGVETM4Pa2h50G/Nw5HXLHy0wOFXOil1bEegsNgN4gMSaMo0g5UHjOIUJMg38/o/am4x0R2li/64BalwKBgQCNGc6oDgF421Fgq3k4n0y+IbTSsqJ3E31xRu1d1QJo/TVw+XrlMSLfVRJs9RR2OsqWF11kUP47SuU+IztTDq2gegIfy3emQ6z36BCketeH79m7GRI9U8200kodCOAzeIF/89KipaZPQFsgPDbkcWNtbSNL28y0+l6Hs0X3yDySIQKBgBTl7C0Q52VAiqsIs5ey9wcUtEgdHIHYmY3snA0R1ckwNDKrvGFvDncb+O5hcuCW4MhJRSMAhK1WdXjOG2/92xfwfh24EcG8jdZSPyg1IQ7xVO7MH8bBmoNelT6RxuQ3kO66wVIM6Lw78o8ewkfsjR3YqWrGJZYAR3AzPNAiOaDXAoGAJoYGQyHXywxuEmuepBPyGvMO8HuvGb2rgRLxWa3/g3Smc5rZr9uTftA2QKNFG+Z/Sy1D5VCrqLqRDj8GQm3+f5LwI4gkubM+dUzZxl53m/ijRI7ayP2paxYDABxdQhBDoxCJ0LhTSM30Uz+9aO+ASu8CNQLkyACXcItErhrwVqECgYAjUJO3k4+VIiMtXj+JdufAE0EtpwUKMrVyi/ayz11YzuSxVD8SnTp9/THEaGeJwLnJoChB06aJLGbx4hKH2dTPVeXr9SsMEoLEcbHlbqJUwysbnUehiKEu8INEMhxTBhqbIFN5Yqwg/ILUkEASfQYk0zuI6NMTTvj31URkYuiW/w==";


	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoe2DwTB6B3OlpCu7eT4c+MDHNxuh2RrIhdFDXViXIdR66jYJTtv8OxPRX0G7z6tfeemgBhUYTL7iG7Z05U8XIrZiLp8K/j2SM0j1WUWxEwyRjFyXFGXyAdxEni/rEZYa02RDDNpzCp7CgoQOY2febTq40mJW6+bjYeoudbcSugmkzJThYT5c5wIYzwi7+CCA+9FZcfQ/HLAcEkXgAuMjJc+ar/g5MEmc+O3VQpogrPX0jWtgg6MnnuaOCm7v0y1/P8JoGK8dmRJYcmtVmZ6VgmpyFRrj0hh8eqcaArm3ctwO9Ftrf6AWjBz8aTUY8+Avz27YnTK+tMxEiYyjln7fcQIDAQAB";


	public static String SIGNTYPE = "RSA2";
	
	private static String URL = "https://openapi.alipay.com/gateway.do";


	public static String CHARSET = "UTF-8";


	private static String FORMAT = "json";

	private static String notify_url = "http://localhost/AlipayMobileWebPayDemo/OrderNotifyWeb";

	private static String return_url = "http://localhost/AlipayMobileWebPayDemo/OrderReturnWeb";
	
	private static AlipayClient client = new DefaultAlipayClient(URL, APPID, RSA_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY,SIGNTYPE);
	
	
	public static String OrderQuery(String out_trade_no){
	    AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
	    AlipayTradeQueryModel bizModel = new AlipayTradeQueryModel();
	    bizModel.setOutTradeNo(out_trade_no);
	    request.setBizModel(bizModel);
	    try {
	    	AlipayTradeQueryResponse response = client.execute(request);
		    return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String OrderRefund(String out_trade_no, String refund_amount){
		AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
	    AlipayTradeRefundModel bizModel = new AlipayTradeRefundModel();
	    bizModel.setOutTradeNo(out_trade_no);
	    bizModel.setRefundAmount(refund_amount);
	    request.setBizModel(bizModel);
	    try {
	    	AlipayTradeRefundResponse response = client.execute(request);
		    return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String OrderPay(String out_trade_no, String total_amount, String subject, String body){
	    if(body.length()>128) body=body.substring(0, 128);
	    AlipayTradeWapPayRequest request=new AlipayTradeWapPayRequest();
	    AlipayTradeWapPayModel model=new AlipayTradeWapPayModel();
	    model.setOutTradeNo(out_trade_no);
	    model.setSubject(subject);
	    model.setTotalAmount(total_amount);
	    model.setBody(body);
	    model.setTimeoutExpress("2m");
	    model.setProductCode("QUICK_WAP_PAY");
	    request.setBizModel(model);
	    
	    request.setNotifyUrl(notify_url);
	    request.setReturnUrl(return_url);
	    
	    try {
	    	AlipayTradeWapPayResponse response = client.pageExecute(request);
		    return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String RefundQuery(String out_trade_no){
		AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
	    AlipayTradeFastpayRefundQueryModel bizModel = new AlipayTradeFastpayRefundQueryModel();
	    bizModel.setOutTradeNo(out_trade_no);
	    bizModel.setOutRequestNo(out_trade_no);
	    request.setBizModel(bizModel);
	    try {
	    	AlipayTradeFastpayRefundQueryResponse response = client.execute(request);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String TransAccount(String alipayAcco, String money){
		AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
		//AlipayFundTransToaccountTransferModel bizModel=new AlipayFundTransToaccountTransferModel();
	    Map<String, Object> parMap=new HashMap<String, Object>();
		parMap.put("out_biz_no", OrderId());


	    parMap.put("payee_type", "ALIPAY_LOGONID");
	    parMap.put("payee_account", alipayAcco);
	    parMap.put("amount", money);
	    request.setBizContent(JSON.toJSONString(parMap));
	    try {


		    AlipayFundTransToaccountTransferResponse response = client.execute(request);
	    	return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return  null;
		}
	}
	


	public static String OrderId(){
		Random rand = new Random();
		return (System.currentTimeMillis())+""+(rand.nextInt(900000)+100000);
	}

}
