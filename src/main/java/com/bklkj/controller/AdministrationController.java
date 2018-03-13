package com.bklkj.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bklkj.pojo.Administration;
import com.bklkj.service.AdministrationService;

@Controller
@RequestMapping("administration")
public class AdministrationController {
	@Autowired
	private AdministrationService administrationService;
	
	/*String faultAddr =request.getParameter("faultAddr");
	try{
	  faultAddr = URLDecoder.decode(faultAddr , "utf-8");//编码解码
	}catch(Exception e){
	  e.printStackTrace();
	}*/
	
	 //�û���¼���ж�  
    @RequestMapping("/userLogin")
    @ResponseBody
    public String userLogin(String AdministrationName,String AdministrationPassword,HttpServletRequest req){  
        //��ҳ�洫�ص�ֵ���ж����ж�  
        // Pattern pattern = Pattern.compile("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17([0,1,6,7,]))|(18[0-2,5-9]))\\d{8}$");  
        //Matcher matcher = pattern.matcher(phoneNumber);  
        if(AdministrationName==null || AdministrationPassword==null /*|| !matcher.matches()*/){  
            return "0";  
        }  
          
        Administration loanUser = administrationService.userLogin(AdministrationName, AdministrationPassword);  
          
        //�鵽�û��ˣ�ִ�е�¼�ɹ��Ĳ���  
        if(loanUser!=null){  
            req.getSession().setAttribute("loanUser", loanUser);  
            return "1";  
        }else{  
            return "0";  
        }  
    }  
    //
    @RequestMapping("/userExit")
    @ResponseBody
    public String userExit(HttpSession session){  
        session.invalidate();  
        return "0";  
    }
	
    
}
