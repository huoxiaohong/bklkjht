package com.bklkj.Commons;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.service.AlipayService;
import com.bklkj.service.UsertoredbagService;

@Controller
@RequestMapping("alipaytwo")
public class OrderInfoUtil2_0 {
	
	@Autowired
	private  UsertoredbagService usertoredbagService;
	@Autowired
	private  AlipayService alipayService;

    public static final String RSA2_PRIVATE = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJ7gjnf7oqUv8V6WrL0rbdtiNfk8TVzbw86TJTxf9rzHU3aKuOdlFUUwuoG5UWGVwCJfPNL4RZ9JP7e0GzalAlJrNL+4O2i+mVD5/rLHQheFV+iU6CnJ1U/CXV/FF/cgpa74yPLoV0c0TQ6zwJJXcH4+mGD9CKYhCtBPjIGWWDuqUPIjYv65BvUBExyeT0AJA9HlUZksDwsKRXxdAMKAQAyR1GvPvSZ82PpzlPi25sPlz3S93doy293UZGtrHbM1KTnRcwFjlniiz9xNqbro2Rq/XxX1/DsQ5lv83tHnAyC0IU7hN/pk79+PUYo9vHxnt/PRvAGIsPDVqReJjCmct3AgMBAAECggEAaAW/bWgk7NqfStU5F/MYuukskF6Pane46W8t54RB9/jAxkMIb27IM4JWHjh/HaWOgIhC8JJPjNAp8tWoXTlmrD4dpsZPNZMbXLHl96UVCFEKmV3QeizHc1qe5l1e0XEeYiqbpTh+qa5tTeq64mMA/FBkxBiVPGhtDy/auH5+0vL/d2Zjgcbhv3Tq+g7oHy2L6oS01EgPh769+Yh/sA9IRIR/7L5cgppcX2LEi5yZHXJh7LX4uTedd6FmUP4LgaFf02CdWBASgFX+8RehbdwRMjPeZh9bkRoRczz1sAY56BkU/GyBsnYcmtXJc6l2knzbvULQW9RivU2hddgSJfVpgQKBgQD6PzJUVtYM0D0pdcMeGjpgn/DiFRPsl+W8psx8UqUSAgeGYbct3CpizzcqEY1/E5HCQmTEKJX0RAyAVMSNsgepWms356cGVETM4Pa2h50G/Nw5HXLHy0wOFXOil1bEegsNgN4gMSaMo0g5UHjOIUJMg38/o/am4x0R2li/64BalwKBgQCNGc6oDgF421Fgq3k4n0y+IbTSsqJ3E31xRu1d1QJo/TVw+XrlMSLfVRJs9RR2OsqWF11kUP47SuU+IztTDq2gegIfy3emQ6z36BCketeH79m7GRI9U8200kodCOAzeIF/89KipaZPQFsgPDbkcWNtbSNL28y0+l6Hs0X3yDySIQKBgBTl7C0Q52VAiqsIs5ey9wcUtEgdHIHYmY3snA0R1ckwNDKrvGFvDncb+O5hcuCW4MhJRSMAhK1WdXjOG2/92xfwfh24EcG8jdZSPyg1IQ7xVO7MH8bBmoNelT6RxuQ3kO66wVIM6Lw78o8ewkfsjR3YqWrGJZYAR3AzPNAiOaDXAoGAJoYGQyHXywxuEmuepBPyGvMO8HuvGb2rgRLxWa3/g3Smc5rZr9uTftA2QKNFG+Z/Sy1D5VCrqLqRDj8GQm3+f5LwI4gkubM+dUzZxl53m/ijRI7ayP2paxYDABxdQhBDoxCJ0LhTSM30Uz+9aO+ASu8CNQLkyACXcItErhrwVqECgYAjUJO3k4+VIiMtXj+JdufAE0EtpwUKMrVyi/ayz11YzuSxVD8SnTp9/THEaGeJwLnJoChB06aJLGbx4hKH2dTPVeXr9SsMEoLEcbHlbqJUwysbnUehiKEu8INEMhxTBhqbIFN5Yqwg/ILUkEASfQYk0zuI6NMTTvj31URkYuiW/w==";
    public static final String RSA_PRIVATE = "";
    /**
     * 支付宝支付业务：入参app_id
     */
    public static final String APPID = "2017111009837941";

    /**
     * 支付宝账户登录授权业务：入参pid值
     */
    public static final String PID = "2088821581731246";


    /**
     * 构造支付订单参数列表
     *
     * @param app_id
     * @param rsa2
     * @param subject
     * @param body
     * @param price
     * @return
     */

    public static Map<String, String> buildOrderParamMap(String app_id, boolean rsa2, String subject, String body, String price, String out_trade_no,
    		@RequestParam(value = "userid", required = false) String userid,
    		@RequestParam(value = "commodityid", required = false) String commodityid) {
        Map<String, String> keyValues = new HashMap<String, String>();

        keyValues.put("app_id", app_id);

        keyValues.put("biz_content", "{\"timeout_express\":\"30m\",\"product_code\":\"QUICK_MSECURITY_PAY\",\"total_amount\":\"" + price + "\",\"subject\":\"" + subject + "\",\"userid\":\"" + userid + "\",\"commodityid\":\"" + commodityid + "\",\"body\":\"" + body + "\",\"out_trade_no\":\"" + out_trade_no + "\"}");

        keyValues.put("charset", "utf-8");

        keyValues.put("notify_url", " http://518df889.ngrok.io/alipay/payNotify");
        
        keyValues.put("method", "alipay.trade.app.pay");

        keyValues.put("sign_type", rsa2 ? "RSA2" : "RSA");

        keyValues.put("timestamp", "2016-07-29 16:55:53");

        keyValues.put("version", "1.0");

        return keyValues;
    }

    /**
     * 构造支付订单参数信息
     *
     * @param map 支付订单参数
     * @return
     */
    public static String buildOrderParam(Map<String, String> map) {
        List<String> keys = new ArrayList<String>(map.keySet());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.size() - 1; i++) {
            String key = keys.get(i);
            String value = map.get(key);
            sb.append(buildKeyValue(key, value, true));
            sb.append("&");
        }

        String tailKey = keys.get(keys.size() - 1);
        String tailValue = map.get(tailKey);
        sb.append(buildKeyValue(tailKey, tailValue, true));

        return sb.toString();
    }

    /**
     * 要求外部订单号必须唯一。
     *
     * @return
     */
    private static String getOutTradeNo() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return key;
    }
    
    @RequestMapping("alipay")
    @ResponseBody
	//名，介绍，价格，订单编号
    public static Android payinfo(String subject, String body, String price, String out_trade_no,
    		@RequestParam(value = "userid", required = false) String userid,
    		@RequestParam(value = "commodityid", required = false) String commodityid,
    		HttpServletRequest req,Android ad) {
    	//out_trade_no = usertoredbagService.selectnownow()+userid;
    	//price = alipayService.selectordermoney(commodityid);
    	HttpSession session = req.getSession();
		session.setAttribute("commodityid", commodityid);
		System.err.println(req.getSession().getAttribute("commodityid"));
		session.setAttribute("userid", userid);
    	//subject =alipayService.selectsbuject(commodityid);
        boolean rsa2 = (RSA2_PRIVATE.length() > 0);
        Map<String, String> params = OrderInfoUtil2_0.buildOrderParamMap(APPID, rsa2, subject, body, price, getOutTradeNo(), userid, commodityid);
        String orderParam = OrderInfoUtil2_0.buildOrderParam(params);
        String privateKey = rsa2 ? RSA2_PRIVATE : RSA_PRIVATE;
        String sign = OrderInfoUtil2_0.getSign(params, privateKey, rsa2);
        String orderInfo =orderParam + "&" + sign ;
        System.out.println(orderParam);
        System.out.println(sign);
        System.err.println(orderInfo);
      /*  if(commodityid.equals("700000001")){
        	System.out.println(commodityid);
        	ad.setCode(1);
        	ad.setMessage("充值1元成功");
        	alipayService.updateuserintegral10(userid);
        	System.out.println("成功");
        	}else if(commodityid.equals("700000002")){
        		ad.setCode(1);
            	ad.setMessage("充值6元成功");
            	alipayService.updateuserintegral60(userid);
        	}else if(commodityid.equals("700000003")){
        		ad.setCode(1);
            	ad.setMessage("充值18元成功");
            	alipayService.updateuserintegral198(userid);
        	}else if(commodityid.equals("700000004")){
        		ad.setCode(1);
            	ad.setMessage("充值30元成功");
            	alipayService.updateuserintegral388(userid);
        	}else if(commodityid.equals("700000005")){
        		ad.setCode(1);
            	ad.setMessage("充值68元成功");
            	alipayService.updateuserintegral998(userid);
        	}else if(commodityid.equals("700000006")){
        		ad.setCode(1);
            	ad.setMessage("充值128元成功");
            	alipayService.updateuserintegral1988(userid);
        	}*/
     /*   ad.setCode(1);
        ad.setMessage("成功");
        ad.setOrderInfo(orderInfo);*/
        return ad;
    }

    /**
     * 拼接键值对
     *
     * @param key
     * @param value
     * @param isEncode
     * @return
     */
    private static String buildKeyValue(String key, String value, boolean isEncode) {
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append("=");
        if (isEncode) {
            try {
                sb.append(URLEncoder.encode(value, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                sb.append(value);
            }
        } else {
            sb.append(value);
        }
        return sb.toString();
    }

    /**
     * 对支付参数信息进行签名
     *
     * @param map 待签名授权信息
     * @return
     */
    public static String getSign(Map<String, String> map, String rsaKey, boolean rsa2) {
        List<String> keys = new ArrayList<String>(map.keySet());
        // key排序
        Collections.sort(keys);

        StringBuilder authInfo = new StringBuilder();
        for (int i = 0; i < keys.size() - 1; i++) {
            String key = keys.get(i);
            String value = map.get(key);
            authInfo.append(buildKeyValue(key, value, false));
            authInfo.append("&");
        }

        String tailKey = keys.get(keys.size() - 1);
        String tailValue = map.get(tailKey);
        authInfo.append(buildKeyValue(tailKey, tailValue, false));

        String oriSign = SignUtils.sign(authInfo.toString(), rsaKey, rsa2);
        String encodedSign = "";

        try {
            encodedSign = URLEncoder.encode(oriSign, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "sign=" + encodedSign;
    }


}
