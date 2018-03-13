package com.bklkj.alipayservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bklkj.alipay.AlipayUtil;




public class AlipayServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//避免乱码，设置编码
		req.setCharacterEncoding(AlipayUtil.CHARSET);
		String body = req.getParameter("body");
		String subject = req.getParameter("subject");
		String money = req.getParameter("money");
		String orderPay = AlipayUtil.OrderPay(AlipayUtil.OrderId(), money, subject, body);
		System.out.println("商品名称 :"+subject+"\t商品说明"+body+"\t订单金额"+money);
		//直接将支付宝返回的完整表单html输出到页面
		resp.setContentType("text/html;charset=" + AlipayUtil.CHARSET); 
		resp.getWriter().write(orderPay);
		resp.getWriter().flush();
		resp.getWriter().close();
	}

}
