package com.bklkj.dao;

import com.bklkj.pojo.Alipay;
import com.bklkj.pojo.AlipayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayMapper {
    int countByExample(AlipayExample example);

    int deleteByExample(AlipayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Alipay record);

    int insertSelective(Alipay record);

    List<Alipay> selectByExample(AlipayExample example);

    Alipay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Alipay record, @Param("example") AlipayExample example);

    int updateByExample(@Param("record") Alipay record, @Param("example") AlipayExample example);

    int updateByPrimaryKeySelective(Alipay record);

    int updateByPrimaryKey(Alipay record);

	void updateuser(@Param("userid")String userid,@Param("payid") String payid,@Param("alipaystate") String alipaystate);

	String selectalipaystate(@Param("userid")String userid);

	String selectalipayid(@Param("userid")String userid);

	void insertwithdraw(@Param("orderNo")String orderNo,@Param("userid") String userid,@Param("amount") String amount);

	void updateusermoney(@Param("userid")String userid,@Param("amount") String amount);

	Integer selectusergold(@Param("userid")String userid);

	void updategold(@Param("userid")String userid,@Param("amount") String amount);

	String selectordermoney(@Param("commodityid")String commodityid);

	String selectsbuject(@Param("commodityid")String commodityid);

	void updateuserintegral10(@Param("userid")String userid);

	void updateuserintegral60(@Param("userid")String userid);

	void updateuserintegral198(@Param("userid")String userid);

	void updateuserintegral388(@Param("userid")String userid);

	void updateuserintegral1988(@Param("userid")String userid);

	void update10(@Param("userid")String userid);
	void update60(@Param("userid")String userid);
	void update198(@Param("userid")String userid);
	void update388(@Param("userid")String userid);
	void update998(@Param("userid")String userid);
	void update1988(@Param("userid")String userid);
	


	
}