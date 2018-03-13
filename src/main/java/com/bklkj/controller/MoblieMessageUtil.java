package com.bklkj.controller;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class MoblieMessageUtil {

	
    /*// 产品名称:云通信短信API产品,开发者无需替换
    private static final String product = "Dysmsapi";
    // 产品域名,开发者无需替换
    private static final String domain = "dysmsapi.aliyuncs.com";

    // 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    private static String accessKeyId = "LTAIG5caPFPBIBSz";
    private static String accessKeySecret = "rRUlb75dH39ziVqZa7GKsZ2oZ3I5It";
    private static String signName = "呛呛科技";
    private static String identifyingTempleteCode = "SMS_111320136";
    private static String registTempleteCode = "rRUlb75dH39ziVqZa7GKsZ2oZ3I5It";

    public static void init(String accessKeyId, String accessKeySecret, String signName, String identifyingTempleteCode,
            String registTempleteCode) {
        MoblieMessageUtil.accessKeyId = accessKeyId;
        MoblieMessageUtil.accessKeySecret = accessKeySecret;
        MoblieMessageUtil.signName = signName;
        MoblieMessageUtil.identifyingTempleteCode = identifyingTempleteCode;
        MoblieMessageUtil.registTempleteCode = registTempleteCode;
    }

    public static void main(String[] args) throws Exception {
        MoblieMessageUtil.sendSms("18704054695", "呛呛科技",
                "SMS_111320136");
        // 发短信
        SendSmsResponse response = MoblieMessageUtil.sendIdentifyingCode("18704054695", "123456");
        System.out.println("短信接口返回的数据----------------");
        System.out.println("Code=" + response.getCode());
        System.out.println("Message=" + response.getMessage());
        System.out.println("RequestId=" + response.getRequestId());
        System.out.println("BizId=" + response.getBizId());

        response = MoblieMessageUtil.sendNewUserNotice("18704054695", "123456", "4512");
        System.out.println("短信接口返回的数据----------------");
        System.out.println("Code=" + response.getCode());
        System.out.println("Message=" + response.getMessage());
        System.out.println("RequestId=" + response.getRequestId());
        System.out.println("BizId=" + response.getBizId());

    }*/

	
    public static SendSmsResponse sendSms(String userphone, String templateParam, String templateCode, String vcode)
            throws ClientException {
    	//设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
		//初始化ascClient需要的几个参数
		final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
		final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
		//替换成你的AK
		final String accessKeyId = "LTAIG5caPFPBIBSz";//你的accessKeyId,参考本文档步骤2
		final String accessKeySecret = "rRUlb75dH39ziVqZa7GKsZ2oZ3I5It";//你的accessKeySecret，参考本文档步骤2
		//初始化ascClient,暂时不支持多region（请勿修改）
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
		accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);
		 //组装请求对象
		 SendSmsRequest request = new SendSmsRequest();
		 //使用post提交
		 request.setMethod(MethodType.POST);
		 //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
		 request.setPhoneNumbers(userphone);
		 //必填:短信签名-可在短信控制台中找到
		 request.setSignName("呛呛科技");
		 //必填:短信模板-可在短信控制台中找到
		 request.setTemplateCode("SMS_111320136");
		//可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		 //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
		 request.setTemplateParam("{\"name\":\"Tom\", \"code\":\""+vcode+"\"}");
		 //request.setVcode(vcode);
		 //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
		 //request.setSmsUpExtendCode("90997");
		 //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		 request.setOutId("yourOutId");
		//请求失败这里会抛ClientException异常
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
		//请求成功
		}
		return sendSmsResponse;

    }

   /* private static String registTempleteCode = "SMS_111320136";
    public static SendSmsResponse sendNewUserNotice(String mobile, String username, String password) throws Exception {
        try {
            return sendSms(mobile, "{\"username\":\"" + username + "\", \"password\":\"" + password + "\"}",
                    registTempleteCode);
        } catch (ClientException e) {
            throw new Exception(e.getMessage());
        }
    }*/
    
    private static String identifyingTempleteCode = "SMS_111320136";
    public static SendSmsResponse sendIdentifyingCode(String userphone, String vcode) throws Exception {
        try {
            return sendSms(userphone, "{\"code\":\"" + vcode + "\"}", identifyingTempleteCode,vcode);
        } catch (ClientException e) {
            throw new Exception(e.getMessage());
        }
    }
   /* public static void main(String[] args) throws Exception {
		MoblieMessageUtil.sendSms("15712313321", "呛呛科技",
                "SMS_111320136");
        SendSmsResponse response = MoblieMessageUtil.sendIdentifyingCode("", "");
        System.out.println("短信接口返回的数据----------------");
        System.out.println("Code=" + response.getCode());
        System.out.println("Message=" + response.getMessage());
        System.out.println("RequestId=" + response.getRequestId());
        System.out.println("BizId=" + response.getBizId());
        
        System.err.println(sd.getVcode());
    }*/
    
}