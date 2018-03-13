package com.bklkj.dao;

import com.bklkj.pojo.Problem;
import com.bklkj.pojo.ProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    int countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Problem record);

    int insertSelective(Problem record);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);

	Integer selectrand(@Param("userid")String userid, @Param("rownum")Integer rownum);

	Integer selectproblemonetype(@Param("userid")String userid, @Param("rownum")Integer rownum);

	Integer selectproblemtwotype(@Param("userid")String userid, @Param("rownum")Integer rownum);

	Integer selectproblemthreetype(@Param("userid")String userid, @Param("rownum")Integer rownum);

	void insertMin(@Param("rownum")Integer rownum, @Param("redbagmoney")Double redbagmoney, @Param("userid")String userid,@Param("businessid") Integer businessid);

	List<Problem> selectproblemone(@Param("rownum")Integer rownum);

	Integer selectans(@Param("ans")Integer ans,@Param("userid") String userid);

	void updatebusinessmoney(@Param("userid")String userid);

	Double selectmoney(@Param("userid")String userid);

	String selectname(@Param("userid")String userid);

	String selectlogo(@Param("userid")String userid);

	String selectweb(@Param("userid")String userid);

	List<Problem> selectproblem();

	String selectintroduce(@Param("userid")String userid);

	void updatebusinessmoney2(@Param("userid")String userid);

	Integer selectbusinesstype();
	Integer selectbusinesstype2();
	Integer selectbusinesstype3();

	void updatejoinnum1();
	void updatejoinnum2();
	void updatejoinnum3();

	void updatejoinnum11();
	void updatejoinnum22();
	void updatejoinnum33();

	
	
}