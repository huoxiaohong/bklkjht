 package com.bklkj.alipayservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.bklkj.alipay.AlipayUtil;


public class TransAccountServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding(AlipayUtil.CHARSET);
		resp.setContentType("application/json; charset="+AlipayUtil.CHARSET);
		String alipayAcco = req.getParameter("alipayAcco");
		String money = req.getParameter("money");
		//调用支付宝单笔转账到支付宝账号的接口
		String transAccount = AlipayUtil.TransAccount(alipayAcco, money);
		JSONObject obj=JSONObject.parseObject(transAccount);
		//获取查询订单接口返回的信息
		Object object = obj.get("alipay_fund_trans_toaccount_transfer_response");
		System.out.println("收款账号："+alipayAcco+"转账金额："+money+"转账结果："+object.toString());
		PrintWriter out = null;
		try {
		    out = resp.getWriter();
		    out.write(object.toString());
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (out != null) {
		        out.close();
		    }
		}
	}

}
