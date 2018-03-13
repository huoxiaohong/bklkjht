package com.bklkj.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bklkj.pojo.Business;
import com.bklkj.service.BusinessService;

@Controller
@RequestMapping("business")
public class BusinessController {
	
	@Autowired
	private BusinessService businessService;

	@RequestMapping("selectByAll")
	@ResponseBody
	public List<Business> selectBusiness() throws Exception {
		List<Business> list = businessService.selectByAll();
		return list;
	}

	/*@RequestMapping("insertBusiness")
	@ResponseBody
	public void insertBusiness(@RequestParam("business")Business business) throws Exception {
		businessService.insertBusiness(business);
	}*/

	@RequestMapping("deleteBusiness")
	@ResponseBody
	public void delete(@RequestParam("businessId")Integer businessId) throws Exception {
		businessService.deleteById(businessId);
	}

	
	@RequestMapping("updateBusiness")
	@ResponseBody
	public void update(Business business) throws Exception {
		businessService.updateBusinessById(business);

	}

	@RequestMapping("selectByName")
	@ResponseBody
	public List<Business> selectByName(HttpServletRequest request,/*@Param("businessName")*/ @RequestParam("businessName")String businessName)
			throws Exception {
		List<Business> list = businessService.selectByName(businessName);
		/*request.setAttribute("businessName", businessName);*/
		return list;
	}
	
	@RequestMapping("insertBusiness")
	@ResponseBody
	public String insertBusiness(@RequestParam(value = "businessname", required = false) String businessname,
			@RequestParam(value = "businessphone", required = false) String businessphone,
			@RequestParam(value = "businessaddress", required = false) String businessaddress,
			@RequestParam(value = "logo", required = false) String logo,
			@RequestParam(value = "BusinessIntroduce", required = false) String BusinessIntroduce,
			@RequestParam(value = "businessWebsite", required = false) String businessWebsite,
			@RequestParam(value = "businessemail", required = false) String businessemail,
			@RequestParam(value = "businesspicture1", required = false) String businesspicture1,
			@RequestParam(value = "businesspicture2", required = false) String businesspicture2,
			@RequestParam(value = "businesspicture3", required = false) String businesspicture3,
			@RequestParam(value = "businesspicture4", required = false) String businesspicture4,
			@RequestParam(value = "businesspicture5", required = false) String businesspicture5,
			HttpServletRequest request,@RequestParam(value = "file", required = false)MultipartFile file,String all){
			//判断表中有没有商户
			Integer num=businessService.selectforbusinessname();
			if(num==0){
				businessname=request.getParameter("businessname");
				businessphone=request.getParameter("businessphone");
				businessaddress=request.getParameter("businessaddress");
				logo=request.getParameter("logo");
				BusinessIntroduce=request.getParameter("BusinessIntroduce");
				businessWebsite=request.getParameter("businessWebsite");
				businessemail=request.getParameter("businessemail");
				businesspicture1=request.getParameter("businesspicture1");
				businesspicture2=request.getParameter("businesspicture2");
				businesspicture3=request.getParameter("businesspicture3");
				businesspicture4=request.getParameter("businesspicture4");
				businesspicture5=request.getParameter("businesspicture5");
				
			  /*request.setCharacterEncoding("utf-8");	
				response.setCharacterEncoding("UTF-8");
				response.setContentType("application/json;charset=utf-8");		
					String path =request.getSession().getServletContext().getRealPath("upload");  
			        String fileName = file.getOriginalFilename(); 
			        System.out.println(fileName);
			        String newFileName = UUID.randomUUID() + fileName; 
			        File dir = new File(path,newFileName);  
			        all = newFileName;
			        if(!dir.exists()){
			            dir.mkdirs();
			        }
			        userService.updatepicture(userid,all);
			        //MultipartFile自带的解析方法 
			        file.transferTo(dir);*/
				
				if(businessaddress==null&&businessWebsite!=null){
					//businessService.insertbusinesshaveweb();
					
				}else if (businessaddress!=null&&businessWebsite!=null){
					
					
				}else if(businessaddress==null&&businessWebsite==null){
					
					
				}else if(businessaddress!=null&&businessWebsite==null){
					
					
				}
				
				businessService.insertinto(businessname,businessphone,businessaddress,logo,BusinessIntroduce,businessWebsite,
						businessemail,businesspicture1,businesspicture2,businesspicture3,businesspicture4,businesspicture5);
			}
		
	
		
		
		
		
		return "1";
		
	}
	
	
	
}
