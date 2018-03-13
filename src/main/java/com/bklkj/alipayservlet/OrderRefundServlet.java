package com.bklkj.alipayservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.bklkj.alipay.AlipayUtil;


public class OrderRefundServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String out_trade_no = req.getParameter("out_trade_no");
		resp.setCharacterEncoding(AlipayUtil.CHARSET);
		resp.setContentType("application/json; charset="+AlipayUtil.CHARSET);
		PrintWriter out = null;
		//调用查询接口: 查询该订单信息
		String queryOrder = AlipayUtil.OrderQuery(out_trade_no);
		JSONObject obj=JSONObject.parseObject(queryOrder);
		JSONObject jsonObject = obj.getJSONObject("alipay_trade_query_response");
		//获取订单总金额
		String total_amount = jsonObject.get("total_amount").toString();
		//调用退款接口
		String orderRefund = AlipayUtil.OrderRefund(out_trade_no, total_amount);
		JSONObject objx=JSONObject.parseObject(orderRefund);
		//获取退款后返回的信息
		Object object = objx.get("alipay_trade_refund_response");
		System.out.println("订单号："+out_trade_no+"\t订单总金额："+total_amount+"\t返回结果："+object.toString());
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
