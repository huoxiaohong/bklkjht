package com.bklkj.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;
import com.bklkj.Commons.Android;
import com.bklkj.Commons.Authorization;
import com.bklkj.Commons.Forget;
import com.bklkj.Commons.OrderInfoUtil2_0;
import com.bklkj.Commons.Withdraw;
import com.bklkj.pojo.User;
import com.bklkj.service.AlipayService;
import com.bklkj.service.UserService;
import com.bklkj.service.UsertoredbagService;

@Controller
@RequestMapping("alipay")
public class AlipayController {

	@Autowired
	private AlipayService alipayService;
	@Autowired
	private UsertoredbagService usertoredbagService;
	@Autowired
	private UserService userService;


	String APP_ID = "2017111009837941";
	String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJ7gjnf7oqUv8V6WrL0rbdtiNfk8TVzbw86TJTxf9rzHU3aKuOdlFUUwuoG5UWGVwCJfPNL4RZ9JP7e0GzalAlJrNL+4O2i+mVD5/rLHQheFV+iU6CnJ1U/CXV/FF/cgpa74yPLoV0c0TQ6zwJJXcH4+mGD9CKYhCtBPjIGWWDuqUPIjYv65BvUBExyeT0AJA9HlUZksDwsKRXxdAMKAQAyR1GvPvSZ82PpzlPi25sPlz3S93doy293UZGtrHbM1KTnRcwFjlniiz9xNqbro2Rq/XxX1/DsQ5lv83tHnAyC0IU7hN/pk79+PUYo9vHxnt/PRvAGIsPDVqReJjCmct3AgMBAAECggEAaAW/bWgk7NqfStU5F/MYuukskF6Pane46W8t54RB9/jAxkMIb27IM4JWHjh/HaWOgIhC8JJPjNAp8tWoXTlmrD4dpsZPNZMbXLHl96UVCFEKmV3QeizHc1qe5l1e0XEeYiqbpTh+qa5tTeq64mMA/FBkxBiVPGhtDy/auH5+0vL/d2Zjgcbhv3Tq+g7oHy2L6oS01EgPh769+Yh/sA9IRIR/7L5cgppcX2LEi5yZHXJh7LX4uTedd6FmUP4LgaFf02CdWBASgFX+8RehbdwRMjPeZh9bkRoRczz1sAY56BkU/GyBsnYcmtXJc6l2knzbvULQW9RivU2hddgSJfVpgQKBgQD6PzJUVtYM0D0pdcMeGjpgn/DiFRPsl+W8psx8UqUSAgeGYbct3CpizzcqEY1/E5HCQmTEKJX0RAyAVMSNsgepWms356cGVETM4Pa2h50G/Nw5HXLHy0wOFXOil1bEegsNgN4gMSaMo0g5UHjOIUJMg38/o/am4x0R2li/64BalwKBgQCNGc6oDgF421Fgq3k4n0y+IbTSsqJ3E31xRu1d1QJo/TVw+XrlMSLfVRJs9RR2OsqWF11kUP47SuU+IztTDq2gegIfy3emQ6z36BCketeH79m7GRI9U8200kodCOAzeIF/89KipaZPQFsgPDbkcWNtbSNL28y0+l6Hs0X3yDySIQKBgBTl7C0Q52VAiqsIs5ey9wcUtEgdHIHYmY3snA0R1ckwNDKrvGFvDncb+O5hcuCW4MhJRSMAhK1WdXjOG2/92xfwfh24EcG8jdZSPyg1IQ7xVO7MH8bBmoNelT6RxuQ3kO66wVIM6Lw78o8ewkfsjR3YqWrGJZYAR3AzPNAiOaDXAoGAJoYGQyHXywxuEmuepBPyGvMO8HuvGb2rgRLxWa3/g3Smc5rZr9uTftA2QKNFG+Z/Sy1D5VCrqLqRDj8GQm3+f5LwI4gkubM+dUzZxl53m/ijRI7ayP2paxYDABxdQhBDoxCJ0LhTSM30Uz+9aO+ASu8CNQLkyACXcItErhrwVqECgYAjUJO3k4+VIiMtXj+JdufAE0EtpwUKMrVyi/ayz11YzuSxVD8SnTp9/THEaGeJwLnJoChB06aJLGbx4hKH2dTPVeXr9SsMEoLEcbHlbqJUwysbnUehiKEu8INEMhxTBhqbIFN5Yqwg/ILUkEASfQYk0zuI6NMTTvj31URkYuiW/w==";
	//填写的是支付宝的公钥
	String ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoe2DwTB6B3OlpCu7eT4c+MDHNxuh2RrIhdFDXViXIdR66jYJTtv8OxPRX0G7z6tfeemgBhUYTL7iG7Z05U8XIrZiLp8K/j2SM0j1WUWxEwyRjFyXFGXyAdxEni/rEZYa02RDDNpzCp7CgoQOY2febTq40mJW6+bjYeoudbcSugmkzJThYT5c5wIYzwi7+CCA+9FZcfQ/HLAcEkXgAuMjJc+ar/g5MEmc+O3VQpogrPX0jWtgg6MnnuaOCm7v0y1/P8JoGK8dmRJYcmtVmZ6VgmpyFRrj0hh8eqcaArm3ctwO9Ftrf6AWjBz8aTUY8+Avz27YnTK+tMxEiYyjln7fcQIDAQAB";
	String CHARSET = "UTF-8";
    String SIGN_TYPE = "RSA2";
    String FORMAT = "json";
    String URL = "https://openapi.alipay.com/gateway.do";
   
    
	// 支付宝授权接口
	@RequestMapping("authorization")
	@ResponseBody
	public String authorization(@RequestParam(value = "userid", required = false) String userid, Forget ft,HttpServletRequest req)
			throws AlipayApiException {
		//拼接授权页面连接
		String scope = "auth_user,auth_base";
		//这个地址是回调地址，需要修改
		//String redirectUri = URLEncoder.encode("http://3bab2507.ngrok.io/alipay/redirectUri");
		String redirectUri = URLEncoder.encode("http://46189b82.ngrok.io/alipay/redirectUri");
		String url = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=" + APP_ID + "&scope=" + scope
				+ "&redirect_uri=" + redirectUri;
		return url;
	}

	
	// 支付宝回调
	@RequestMapping("redirectUri")
	@ResponseBody
	public String redirectUri(String auth_code, String app_id, String scope, Forget ft,HttpServletRequest req/*,String userid,String payid,String alipaystate*/) {
		// 使用auth_code换取接口access_token
		AlipayClient alipayClient = new DefaultAlipayClient(URL, app_id, APP_PRIVATE_KEY, "json", CHARSET,
				ALIPAY_PUBLIC_KEY, SIGN_TYPE);
		AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
		request.setGrantType("authorization_code");
		request.setCode(auth_code);
		try {
			// 得到access_token
			AlipaySystemOauthTokenResponse oauthTokenResponse = alipayClient.execute(request);
			String accessToken = oauthTokenResponse.getAccessToken();
			// 获取用户信息
			AlipayUserInfoShareRequest getUserInfoReq = new AlipayUserInfoShareRequest();
			try {
				// 得到用户信息
				AlipayUserInfoShareResponse userinfoShareResponse = alipayClient.execute(getUserInfoReq,
						accessToken);
				//alipayService.updateuser(userid,payid,alipaystate);
				System.out.println(userinfoShareResponse.getBody());
				String alipayid=userinfoShareResponse.getUserId();
				System.out.println(alipayid);
				HttpSession session = req.getSession();
				session.setAttribute("alipayid", alipayid);
			} catch (AlipayApiException e) {
				// 处理异常
				e.printStackTrace();
			}
		} catch (AlipayApiException e) {
			// 处理异常
			e.printStackTrace();
		}
		//String URLb = "www.baidu.com";
		ft.setCode(1);
		ft.setMessage("成功");
		return "1234";
	}
	
	/**
     * 提现
     * @param orderNo 订单号，唯一
     * @param payeeAccount 收款方账户
     * @param amount 提现金额
     * @param payerShowName 付款方姓名，可不传
     * @param payeeRealName 收款方真实姓名，可不传
     * @param remark 转账备注，可不传
     * @throws AlipayApiException
     */
	@RequestMapping("withdraw")
	@ResponseBody
	public Withdraw withdraw(@RequestParam(value = "userid", required = false) String userid,String orderNo,String payeeAccount,String amount,String payerShowName,String payeeRealName,String remark,
			@RequestParam(value = "alipayid", required = false) String alipayid,Withdraw ww) throws AlipayApiException {
        
        AlipayClient alipayClient = new DefaultAlipayClient(URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);

        AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
        List<User>list = userService.selectuseralipayid(userid);
        if(list.get(0).getAlipayid()==null){
        	ww.setCode(0);
        	ww.setMessage("请先绑定支付宝账号");
        	ww.setMoney("0");
        	ww.setOrderNo("0");
        }else if(list.get(0).getAlipayid()!=null){
        orderNo = usertoredbagService.selectnownow()+userid;
        payeeAccount = alipayService.selectalipayid(userid);
        System.out.println(orderNo);
        request.setBizContent("{" +
                "    \"out_biz_no\":\""+orderNo+"\"," + // 订单号唯一
                "    \"payee_type\":\"ALIPAY_LOGONID\"," +
                "    \"payee_account\":\""+payeeAccount+"\"," +
                "    \"amount\":\""+amount+"\"," +
                "    \"payee_account\":\""+alipayid+"\","+
                 "    \"payer_show_name\":\""+payerShowName+"\"," + // 付款方姓名
                 /*"    \"payee_real_name\":\""+payeeRealName+"\"," + // 收款方姓名
                "    \"remark\":\""+remark+"\"," +*/
                "  }");
        //查询金币数
       Integer gold = alipayService.selectusergold(userid);
       Integer num = (int) (Double.parseDouble(amount)*1000);
        if(gold<num){
        	ww.setCode(0);
        	ww.setMessage("您的金币数量不足");
        	ww.setMoney("0");
        	ww.setOrderNo("0");
        }
        else if(gold>=num){
        AlipayFundTransToaccountTransferResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
            alipayService.insertwithdraw(orderNo,userid,amount);
            alipayService.updateusermoney(userid,amount);
            ww.setCode(1);
            ww.setMessage("提现成功");
            ww.setMoney(amount);
            ww.setOrderNo(orderNo);
            alipayService.updategold(userid,amount);
        } else {
            System.out.println("调用失败");
            ww.setCode(0);
            ww.setMessage("提现失败");
            ww.setMoney("0");
            ww.setOrderNo("");
        		}
        	}
        }
		return ww;
    }
	
	/**
     * 支付接口
     * @param body 订单具体描述信息，可不传
     * @param subject 商品的标题
     * @param outTradeNo 唯一订单号
     * @param timeoutExpress 该笔订单允许的最晚付款时间，取值范围：1m～15d（m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）
     * @param totalAmount 订单总金额（单位元）
     * @param notifyUrl 支付宝服务器主动通知商户服务器里指定的页面http/https路径
     */
	@RequestMapping("pay")
	@ResponseBody
    public String pay(/*String body,*/String subject,String outTradeNo,String timeoutExpress,String totalAmount,String notifyUrl,
    		@RequestParam(value = "userid", required = false) String userid,
    		@RequestParam(value = "commodityid", required = false) String commodityid,HttpServletResponse response2) {
        AlipayClient alipayClient = new DefaultAlipayClient(URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        //实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        //SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        try {
        outTradeNo = usertoredbagService.selectnownow()+userid;
        System.out.println("订单号是："+outTradeNo);
        totalAmount = alipayService.selectordermoney(commodityid);
		subject = alipayService.selectsbuject(commodityid);
        timeoutExpress = "15m";
        notifyUrl="http://9b0dc96d.ngrok.io/alipay/payNotify";
        } catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       // model.setBody(body);
        model.setSubject(subject);
        model.setOutTradeNo(outTradeNo);
        model.setTimeoutExpress(timeoutExpress);
        model.setTotalAmount(totalAmount);
        model.setProductCode("QUICK_MSECURITY_PAY");
        //model.setProductCode(userid);
        //model.setProductCode(commodityid);
        request.setBizModel(model);
        request.setNotifyUrl(notifyUrl);
        try {
            //这里和普通的接口调用不同，使用的是sdkExecute
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
            return response.getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
		return notifyUrl;
		
    }
    
    /**
     * 支付回调接口
     * @param paramsMap 将异步通知中收到的待验证所有参数都存放到map中
     * @throws AlipayApiException
     * @throws UnsupportedEncodingException 
     */
	@RequestMapping("payNotify")
	@ResponseBody
    public Android payNotify(/*Map<String, String> paramsMap,*/HttpServletRequest request,HttpServletResponse response,Android ad) throws AlipayApiException, UnsupportedEncodingException {
		Map<String,String> params = new HashMap<String,String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
		    String name = (String) iter.next();
		    String[] values = (String[]) requestParams.get(name);
		    String valueStr = "";
		    for (int i = 0; i < values.length; i++) {
		        valueStr = (i == values.length - 1) ? valueStr + values[i]
		                    : valueStr + values[i] + ",";
		  	}
		    //乱码解决，这段代码在出现乱码时使用。
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
        boolean signVerified = AlipaySignature.rsaCheckV1(params,ALIPAY_PUBLIC_KEY,CHARSET,"RSA2"); //调用SDK验证签名
		if(signVerified){
            // TODO 验签成功后
            //按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success，校验失败返回failure
            String tradeStatus = params.get("trade_status");
            String buyerPayAmount = params.get("buyer_pay_amount");
            //进行1\2\3\4二次校验
            //订单号
            String outTradeNo = params.get("out_trade_no");
            //金额
            String totalAmount=params.get("total_amount");
            //卖家id
            String sellerId=params.get("seller_id");
            //appid
            String appId=params.get("app_id");
            
            // 交易创建
            if (StringUtils.equals(tradeStatus, "WAIT_BUYER_PAY")) {
            	
            }
            // 交易成功
            if (StringUtils.equals(tradeStatus, "TRADE_SUCCESS")) {
            	//if(outTradeNo==response.get)
            	/*ad.setCode(1);
            	ad.setMessage("您已充值"+buyerPayAmount+"元成功");*/
            	
            }
            // 未付款交易超时关闭，或支付完成后全额退款
            if (StringUtils.equals(tradeStatus, "TRADE_CLOSED")) {
            	ad.setCode(0);
            	ad.setMessage("交易超时");
            }
            // 交易结束，不可退款
            if (StringUtils.equals(tradeStatus, "TRADE_FINISHED")) {
            	ad.setCode(1);
            	ad.setMessage("交易结束");
            }
        }else{
            // TODO 验签失败则记录异常日志，并在response中返回failure.
        	System.out.println("验签失败");
        	//System.out.println("成功"+requestParams.get(req).toString());
        	ad.setCode(0);
        	ad.setMessage("验签失败");
        }
		return ad;
    }


	
	//认证界面
	@RequestMapping("alipay")
	@ResponseBody
	public Authorization  authorization(@RequestParam(value = "userid", required = false) String userid,
			@RequestParam(value = "alipayid", required = false) String payid,HttpServletRequest req,
			@RequestParam(value = "alipaystate", required = false) String alipaystate,Authorization an,
			@RequestParam(value = "alistate", required = false) String alistate){
		payid = (String) req.getSession().getAttribute("alipayid");
		System.out.println(payid);
		alipayService.updateuser(userid,payid,alipaystate);
		alistate=alipayService.selectalipaystate(userid);
		System.err.println(alistate);
		if(alistate.equals("1")){
		an.setCode(1);
		an.setMessage("成功");
		an.setAlipaystate("1");
		}else if(alistate.equals("0")){
			an.setCode(0);
			an.setMessage("您还未授权支付宝");
			an.setAlipaystate("0");
		}
		return an;
	}

	
	//支付宝购买
	@RequestMapping("alipaypay")
	@ResponseBody
	public Android alipaypay(String subject, String body, String price, String out_trade_no,
    		@RequestParam(value = "userid", required = false) String userid,
    		@RequestParam(value = "commodityid", required = false) String commodityid,
    		HttpServletRequest req,Android ad){
		
		 OrderInfoUtil2_0.payinfo(subject, body, price, out_trade_no, userid, commodityid, req, ad);
		return null;
		
		
	}
	
	
	
	
	
}
