package com.bklkj.dao;

import com.bklkj.pojo.Business;
import com.bklkj.pojo.BusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    int countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
    // 
    public List<Business> selectByAll();  
    // 
    public int updateById(Business business);  
    //  
    public void insertBusiness(Business business);  
    // 
    public Integer deleteById(@Param("business")Business business); 
    //
	List<Business> selectByPrimaryKey(String businessname);

	List<Business> selectByName(@Param("businessName")String businessName);

	void deleteByExample(Business businessId);

	int deleteById(Integer businessId);

	void updateByExampleSelective(Business businessId);

	void updateBusinessById(Business businessId);

	Integer selectbusinesscount();

	List<String> selectBusinessname();
/*****************************************************************/
	Integer selectforbusinessname();

	void insertinto(@Param("businessname")String businessname, @Param("businessName")String businessphone, @Param("businessaddress")String businessaddress,@Param("logo") String logo,
			@Param("businessIntroduce")String businessIntroduce,@Param("businessWebsite") String businessWebsite, @Param("businessemail")String businessemail, @Param("businesspicture1")String businesspicture1,
			@Param("businesspicture2")String businesspicture2, @Param("businesspicture3")String businesspicture3, @Param("businesspicture4")String businesspicture4, @Param("businesspicture5")String businesspicture5);

}