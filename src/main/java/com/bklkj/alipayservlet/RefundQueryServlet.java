package com.bklkj.alipayservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.bklkj.alipay.AlipayUtil;

public class RefundQueryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String out_trade_no = req.getParameter("out_trade_no");
		resp.setCharacterEncoding(AlipayUtil.CHARSET);
		resp.setContentType("application/json; charset="+AlipayUtil.CHARSET);
		//调用查询接口: 查询该订单信息
		String RefundQuery = AlipayUtil.RefundQuery(out_trade_no);
		JSONObject obj=JSONObject.parseObject(RefundQuery);
		//获取查询订单接口返回的信息
		Object object = obj.get("alipay_trade_fastpay_refund_query_response");
		System.out.println("查询订单号："+out_trade_no+"\t查询订单结果："+object.toString());
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
