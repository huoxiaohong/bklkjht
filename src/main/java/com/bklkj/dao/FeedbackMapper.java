package com.bklkj.dao;

import com.bklkj.pojo.Feedback;
import com.bklkj.pojo.FeedbackExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {
    int countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

	List<Feedback> selectByAll();

	Integer selectByUserPhone(int UserPhone);

	void updateByUserId(Feedback feedback);

	Integer deleteById(Feedback feedback);

	Integer selectByFeedType(String feedType);

	Integer insertfeedback(@Param("userid")String userid, @Param("feedback")String feedback);

	void updateFrequency(@Param("userid")String userid,@Param("frequency") String frequency);

	Integer selectnum(@Param("userid")String userid);

	String selectfeedback(@Param("feedback")String feedback,@Param("userid") String userid);

	List<Feedback> selectAll(@Param("userid")String userid);

	Integer insertfeedbackadd(@Param("userphone")String userphone, @Param("userid")String userid, @Param("feedback")String feedback,@Param("feedtype") String feedtype,@Param("useremail") String useremail);

}